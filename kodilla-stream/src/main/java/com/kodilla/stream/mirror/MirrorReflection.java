package com.kodilla.stream.mirror;

import java.util.*;

public class MirrorReflection {
    private String word;

    public MirrorReflection(String word) {
        this.word = word;
    }

    //    public String replace(String xx){
//        Deque<Character> characterList = new ArrayDeque<>();
//        String rep = "";
//        for (int i = 0 ; i<xx.length() ; i++){
//            characterList.push(xx.charAt(i));
//        }
//        for (Character c1 : characterList){
//            rep += c1.charValue();
//        }
//        return rep;
//    }
public String replace(){
    Deque<Character> characterList = new ArrayDeque<>();
    String rep = "";
    for (int i = 0 ; i<word.length() ; i++){
        characterList.push(word.charAt(i));
    }
    for (Character c1 : characterList){
        rep += c1.charValue();
    }
    return rep;
}
}
