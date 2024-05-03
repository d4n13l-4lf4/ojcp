package org.d4n13l_4lf4.ch01;

public class DeclaringVariables {

    String s1, s2, s3;
    String s4 = "s4", s5 = "s5", s6 = "s6";

    final int y = 10;
    final int[] favoriteNumbers = new int[10];

    public DeclaringVariables() {
        s1 = "s1";
        s2 = "s2";
        s3 = "s3";
        favoriteNumbers[0] = 1;
    }

    public void findAnswer(boolean check) {
        // can use var just for local variables.
        // must be defined in the same line in which they are declared.
        var anotherThing = "jajaja";
        var silly
                = 3;

    }

    public String toString() {
        return s1 + ":" + s2 + ":" + s3 + ":" + s4 + ":" + s5 + ":" + s6;
    }
}

class Var {
    public void var() {
        var var = "var";
    }

    public void Var() {
        Var var = new Var();
    }
}
