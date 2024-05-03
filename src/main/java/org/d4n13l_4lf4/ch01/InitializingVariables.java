package org.d4n13l_4lf4.ch01;

public class InitializingVariables {
    public static void main(String[] args) {
        final Integer data = 10;
        final int[] favoriteNumbers = new int[10];
        int x = 10;
        // vars are only allowed as local variables and must be defined in one line.
        var name = "My Name";

        System.out.println(x);
        System.out.println(data);
        System.out.println(favoriteNumbers[0]);
    }
}
