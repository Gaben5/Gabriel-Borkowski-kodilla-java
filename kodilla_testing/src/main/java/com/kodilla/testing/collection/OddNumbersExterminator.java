package com.kodilla.testing.collection;

import java.util.List;

public class OddNumbersExterminator {

    private List<Integer> oddNumbers;

    public OddNumbersExterminator(List<Integer> oddNumbers) {
        this.oddNumbers = oddNumbers;
    }

    public List<Integer> exterminate(List<Integer> numbers){
        oddNumbers.clear();
        for(int i=0; i< numbers.size(); i++){
            if (numbers.get(i) % 2 == 0 ){
                oddNumbers.add(numbers.get(i));
            }
        }
        return oddNumbers;
    }

    public List<Integer> getOddNumbers() {
        return oddNumbers;
    }
}
