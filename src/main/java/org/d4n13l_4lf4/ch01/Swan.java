package org.d4n13l_4lf4.ch01;

import java.sql.*;
import java.util.Date;

public class Swan {
    int numberEggs;
    String firstName = "FirstName";
    String lastName = "LastName";
    long age;

    String fullName = firstName + " " + lastName;

    public Swan() {
        age = 1200;
    }

    public void Run() {}

    public static void main(String[] args) {
        Swan mother = new Swan();

        mother.numberEggs = 100;

        System.out.println(mother.numberEggs);

        {
            System.out.println("Code block!");
            var blocky = """
squirrel \s
pigeon \
termite""";
            System.out.print(blocky);

            float data = 0.0f;
            System.out.println(data);

            var num1 = Long.valueOf("100");
        }
    }
}
