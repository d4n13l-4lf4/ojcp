package org.d4n13l_4lf4.ch01;

// Order of initialization
// Fields, Blocks, Constructors, each one in order of declaration.
public class Egg {

    public Egg() {
       number = 5;
    }

    public static void main(String[] args) {
        Egg egg = new Egg();
        System.out.println(egg.number);
    }

    private int number = 3;

    {
        number = 4;
    }
}
