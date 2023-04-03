package com.kodilla.good.patterns.challenges;
import java.util.Collection;
public class ChallengesMain {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
                movieStore.getMovies().values().stream()
                .flatMap(Collection::stream)
                        .forEach(x -> System.out.print(x+"!"));



    }
}
