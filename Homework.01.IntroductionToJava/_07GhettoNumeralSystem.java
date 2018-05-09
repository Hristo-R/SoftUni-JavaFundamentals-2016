package com.company;

import java.util.Scanner;

public class _07GhettoNumeralSystem {

    public static void main(String[] args) {
        // Write a program that converts the decimal number system to the ghetto numeral system.
        // In the ghetto, numbers are represented as following:
        //        	0 – Gee
        //        	1 – Bro
        //        	2 – Zuz
        //        	3 – Ma
        //        	4 – Duh
        //        	5 - Yo
        //        	6 – Dis
        //        	7 – Hood
        //        	8 – Jam
        //        	9 – Mack

        System.out.print("Input: ");
        Scanner input = new Scanner(System.in);
        String inputLine = input.nextLine();
        StringBuilder result = new StringBuilder();

        System.out.print("Output: ");
        for (int i = 0; i < inputLine.length(); i++) {
            int charToInt = inputLine.charAt(i) - 48;
            switch (charToInt) {
                case 0: result.append("Gee"); break;
                case 1: result.append("Bro"); break;
                case 2: result.append("Zuz"); break;
                case 3: result.append("Ma"); break;
                case 4: result.append("Duh"); break;
                case 5: result.append("Yo"); break;
                case 6: result.append("Dis"); break;
                case 7: result.append("Hood"); break;
                case 8: result.append("Jam"); break;
                case 9: result.append("Mack"); break;
            }
        }
        System.out.println(result);
    }
}
