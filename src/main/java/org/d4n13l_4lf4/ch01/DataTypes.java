package org.d4n13l_4lf4.ch01;

public class DataTypes {

    public static void main(String[] args) {
        boolean bool = true;
        byte bt = 0x01;
        short st = 123;
        int it = -2_147_483_648;
        long lng = -2^63L;
        float fl = 0.0f;
        double dbl = 0.0;
        char cg = 'a';

        Boolean wrappedBool = bool;
        Byte wrappedBt = Byte.valueOf(bt);
        Short wrappedSt = Short.valueOf(st);
        Integer wrappedIt = Integer.valueOf(it);
        Long wrappedLng = Long.valueOf(lng);
        Float wrappedFl = Float.valueOf(fl);
        Double wrappedDbl = Double.valueOf(dbl);
        Character wrappedCg = Character.valueOf(cg);

        long max = 3123456789L;
        int a = 010 + 0x1F0 + 0b01 + 1; // octal, hexa, binary.

        String reference = "reference";

        reference = "another reference";

        System.out.println(reference);
        System.out.println(Integer.sum(1, 2));

        String eyeTest = "\"Java Study Guide\"\n";
        System.out.println(eyeTest);

        String multiline = """
        Jajaja
            jojojo       \s
               \s""";

        System.out.println(multiline);

        String block = """
                 "doe""\"
                 "deer""\"
                """;
        System.out.println(block);
    }
}
