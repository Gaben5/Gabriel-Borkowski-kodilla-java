package com.remote.streams.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("RRMartin", "Game of thrones", 1996,List.of("a","b","c")));
        books.add(new Book("Jan", "Programowanie obiektowe", 2005,List.of("a","c")));
        books.add(new Book("Maurycy", "Maur i przyjaciele", 1278,List.of("b","c")));
        books.add(new Book("Bolek", "Bolek i Bolek", 2012,List.of("a","b","c","d")));
        books.add(new Book("Lolek", "Lolek i Bolek", 1999,List.of("a","c","d")));

        Set<String> result = books.stream()
                .filter(b -> b.getYear() > 1999)
                .flatMap(b -> b.getReaders().stream())
                .collect(Collectors.toSet());

        System.out.println(result);
    }
}
