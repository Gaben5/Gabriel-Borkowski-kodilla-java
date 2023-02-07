package com.kodilla.testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchingForVowels {
    private String str;
    private String vowels="";


    public SearchingForVowels(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public String searchForVowels() {
        for (int i = 0; i < str.length(); i++) { //próbowałem to zrobić z ArrayList ale nie mogłem sobie poradzić, na spotkaniu możemy to jeszcze obgadać
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'u' || str.charAt(i) == 'y' || str.charAt(i) == 'o' ) {
                vowels += str.charAt(i);
            }
            }
            System.out.println(vowels);
            return vowels;
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
