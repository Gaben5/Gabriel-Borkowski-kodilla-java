package com.kodilla;

import java.util.ArrayList;
import java.util.List;

public class Calk {
    int a;
    int b;
    int c;
    private int x;
    private String str;

    public int TransformStrToInt(String str){  // do zadania z CodeWars
        this.str = str;
        return Integer.parseInt(str);
    }


    List<Integer> numbersModulo = new ArrayList<>();

    public void addToListModulo(int a, int b, int c)
    {
        numbersModulo.clear();
        this.a = a;
        this.b = b;
        this.c = c;
        for (int i = a; i <= b; i++) {
            if (i%c == 0){
                numbersModulo.add(i);
            }
        }
    }

}
