package com.remote.streams.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("RRMartin", "Game of thrones", 1996));
        books.add(new Book("Jan", "Programowanie obiektowe", 2005));
        books.add(new Book("Maurycy", "Maur i przyjaciele", 1278));
        books.add(new Book("Bolek", "Bolek i Bolek", 2012));
        books.add(new Book("Lolek", "Lolek i Bolek", 1999));

        List<Book> result = books.stream()
                .filter(b -> b.getYear() > 1999)
                .map(b -> new Book(b.getAuthor().toUpperCase(), b.getTitle(), b.getYear()))
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
