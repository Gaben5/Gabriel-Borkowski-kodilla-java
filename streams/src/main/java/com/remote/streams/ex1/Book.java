package com.remote.streams.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Book {
    private String author;
    private String title;
    private int year;
    List<String> readers = new ArrayList<>();

    public Book(String author, String title, int year, List<String> readers) {
        this.author = author;
        this.title = title;
        this.year = year;
        this.readers = readers;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public List<String> getReaders() {
        return readers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(author, book.author) && Objects.equals(title, book.title) && Objects.equals(readers, book.readers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title, year, readers);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", readers=" + readers +
                '}';
    }
}
