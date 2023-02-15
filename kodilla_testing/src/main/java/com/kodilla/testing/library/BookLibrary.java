package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {

    private LibraryDataBase libraryDataBase;

    public BookLibrary(LibraryDataBase libraryDataBase) {
        this.libraryDataBase = libraryDataBase;
    }

    public List<Book> listBooksWithCondition(String titleFragment){
        List<Book> bookList = new ArrayList<>();
        Book book = new Book("The book title", "The book author", 2000);
        bookList.add(book);

        return bookList;
    }
}
