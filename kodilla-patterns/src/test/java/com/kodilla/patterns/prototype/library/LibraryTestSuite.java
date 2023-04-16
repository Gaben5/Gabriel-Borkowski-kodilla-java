package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {
    @Test
    void testGetBooks(){
        //Given
        Library library = new Library("Library");
        //creating the booksToRead
        Book book1 = new Book("A1","T1", LocalDate.of(2000,5,4));
        Book book2 = new Book("A2","T2", LocalDate.of(2020,11,12));
        Book book3 = new Book("A3","T3", LocalDate.of(2013,1,31));
        //add books to library
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        //making a shallow copy of object Library
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library Shallow Copy");
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //making a deep copy object library
        Library deepcloneLibrary = null;
        try {
            deepcloneLibrary = library.deepCopy();
            deepcloneLibrary.setName("Library Deep Copy");
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }
        //When
        library.getBooks().remove(book1);
        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepcloneLibrary);
        assertEquals(2, library.getBooks().size());
        assertEquals(2, clonedLibrary.getBooks().size());
        assertEquals(3, deepcloneLibrary.getBooks().size());
    }
}
