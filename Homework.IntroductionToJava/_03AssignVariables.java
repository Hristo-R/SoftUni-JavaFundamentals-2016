package com.company;

public class _03AssignVariables {

    public static void main(String[] args) {
        // You are given the following types: byte, short, int, long, char, boolean, float, double, and String.
        // Assign the following values to them
        // false, “Palo Alto, CA”, 32767, 2000000000, 0.1234567891011, 0.5f, 919827112351L, 127, ‘c’.
        // Try to assign 32768 to short and see what happens.

        boolean booleanType = false;
        String stringType = "Palo Alto, CA";
        short shortType = 32767;
        int intType = 2000000000;
        double doubleType = 0.1234567891011;
        float floatType = 0.5f;
        long longType = 919827112351L;
        byte byteType = 127;
        char charType = 'c';
        //short anotherShortType = 32768;

        System.out.println(booleanType + " - boolean type");
        System.out.println(stringType + " - string type");
        System.out.println(shortType + " - short type");
        System.out.println(intType + " - int type");
        System.out.println(doubleType + " - double type");
        System.out.println(floatType + " - float type");
        System.out.println(longType + " - long type");
        System.out.println(byteType + " - byte type");
        System.out.println(charType + " - char type");
    }
}
