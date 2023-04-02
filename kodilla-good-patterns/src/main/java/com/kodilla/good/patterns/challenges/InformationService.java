package com.kodilla.good.patterns.challenges;

public interface InformationService {
    public default String inform(User user) {
        return "Information service";
    }

}
