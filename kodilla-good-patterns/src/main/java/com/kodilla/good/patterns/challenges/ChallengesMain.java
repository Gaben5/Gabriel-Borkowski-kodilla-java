package com.kodilla.good.patterns.challenges;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
public class ChallengesMain {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
                movieStore.getMovies().values().stream()
                .flatMap(Collection::stream)
                        .forEach(x -> System.out.print(x+"!"));



    }
}
