package com.kodilla;

public class Calk {
    private int x;
    private String str;

    public int TransformStrToInt(String str){
        this.str = str;
        return Integer.parseInt(str);
    }
}
