package com.kodilla.testing.library;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BookDirectoryTestSuite {
    @Mock
    private LibraryDataBase libraryDataBaseMock;

    private List<Book> generateListOfNBooks(int booksQuantity){
        List<Book> resultList = new ArrayList<>();
        for (int n = 1 ; n <=booksQuantity ; n++){
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    void testListBooksWithConditionsReturnList(){
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDataBaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Almo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directores", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDataBaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);
        //When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");
        //Then

        assertEquals(4,theListOfBooks.size());
    }

    @Test
    void testListBooksWithConditionMoreThan20(){
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDataBaseMock);
        List<Book> resultListOf0Books = new ArrayList<>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDataBaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf15Books);
        when(libraryDataBaseMock.listBooksWithCondition("ZeroBooks")).thenReturn(resultListOf0Books);
        when(libraryDataBaseMock.listBooksWithCondition("FortyBooks")).thenReturn(resultListOf40Books);

        //When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
        //Then
        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    void testListBooksWithConditionFragmentShorterThan3(){
        //Given
        LibraryDataBase libraryDataBaseMock = mock(LibraryDataBase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDataBaseMock);

        //When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");
        //Then
        assertEquals(0,theListOfBooks10.size());
        verify(libraryDataBaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    void testListBooksInHandsOf0(){
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDataBaseMock);
        LibraryUser libraryUser0 = new LibraryUser("Jan", "Nowak", "123456");
        LibraryUser libraryUser1 = new LibraryUser("Miłosz", "Kot", "654321");
        LibraryUser libraryUser5 = new LibraryUser("Kamil", "Pies", "645123");
        List<Book> listOf0Books = generateListOfNBooks(0);
        List<Book> listOf1Books = generateListOfNBooks(1);
        List<Book> listOf5Books = generateListOfNBooks(5);
        when(libraryDataBaseMock.listBooksInHandsOf(libraryUser0)).thenReturn(listOf0Books);
        when(libraryDataBaseMock.listBooksInHandsOf(libraryUser1)).thenReturn(listOf1Books);
        when(libraryDataBaseMock.listBooksInHandsOf(libraryUser5)).thenReturn(listOf5Books);


        //When
        List<Book> theListOfHandsBook0 = bookLibrary.listBooksInHandsOf(libraryUser0);
        List<Book> theListOfHandsBook1 = bookLibrary.listBooksInHandsOf(libraryUser1);
        List<Book> theListOfHandsBook5 = bookLibrary.listBooksInHandsOf(libraryUser5);
        //Then
        assertEquals(0,theListOfHandsBook0.size());
        assertEquals(1,theListOfHandsBook1.size());
        assertEquals(5,theListOfHandsBook5.size());
    }

    @Test
    void testListBooksInHandsOf1(){
        //Given

        //When

        //Then

    }

    @Test
    void testListBooksInHandsOf5(){
        //Given

        //When

        //Then

    }


}
