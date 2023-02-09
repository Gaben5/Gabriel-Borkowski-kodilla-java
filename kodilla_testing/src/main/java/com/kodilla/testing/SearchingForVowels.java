package com.kodilla.testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchingForVowels {
    private String str;
    private String vowels2="aeyuoAEYUO";
    private String vowels="";


    public SearchingForVowels(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public String searchForVowels2(String vol){
        vowels="";
        for(int i=0; i<vol.length(); i++){
            for(int y=0;y<vowels2.length();y++){
                if (vol.charAt(i)==vowels2.charAt(y)){
                    vowels+=vowels2.charAt(y);
                }
            }
        }
        return vowels;
    }

    public String getVowels() {
        return vowels;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
