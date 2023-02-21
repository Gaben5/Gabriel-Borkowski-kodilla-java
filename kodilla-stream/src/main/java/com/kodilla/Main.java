package com.kodilla;

import com.kodilla.stream.mirror.MirrorReflection;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        MirrorReflection mirrorReflection = new MirrorReflection("Ewa");
        System.out.println(mirrorReflection.replace());
    }
}