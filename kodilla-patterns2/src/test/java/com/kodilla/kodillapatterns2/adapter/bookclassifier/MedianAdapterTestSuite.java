package com.kodilla.kodillapatterns2.adapter.bookclassifier;

import com.kodilla.kodillapatterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest(){
        //Given
        Set<Book> bookSet = new HashSet<>();
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        bookSet.add(new Book("John Cena", "Autobiography", 2018, "Sign1"));
        bookSet.add(new Book("B. A. Paris", "The Dilemma", 2020, "Sign2"));
        bookSet.add(new Book("Cara Hunter", "No Way Out", 2019, "Sign3"));
        //Then
        Assertions.assertEquals(2019,medianAdapter.publicationYearMedian(bookSet));
    }
}
