package org.d4n13l_4lf4.ch01;

public class Chick {
    Integer one;

    public Chick() {
        one = 1;
        System.out.println("Chick constructor");
    }

    {
        System.out.println("Chick init");
    }

    public void Chick() {}

    public static void main(String... args) {
        Chick chick = new Chick();

        System.out.println(chick);
    }
}
