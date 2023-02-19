package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        //double nextElements = IntStream.range(0,numbers.length)
        IntStream.range(0,numbers.length)
                .map(m -> numbers[m])
                .forEach(System.out::println);

        return IntStream.range(0, numbers.length)
                .map(m -> numbers[m])
                .average()
                .getAsDouble();

    }
}
