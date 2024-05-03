package org.d4n13l_4lf4.ch01;

import java.util.Random;
// Redundant import. java.lang.System is automatically imported.
import java.lang.System;

public class NumberPicker {

    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println(rand.nextInt(10));
    }
}
