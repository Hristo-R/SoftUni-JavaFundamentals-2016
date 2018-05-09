package com.company;

import java.util.Scanner;

public class _06SumNumbersFrom1ToN {

    public static void main(String[] args) {
        // Create a Java program that reads a number N from the console and
        // calculates the sum of all numbers from 1 to N (inclusive).

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number N = ");
        String inputLine = input.nextLine();
        int n = Integer.parseInt(inputLine);
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.printf("The sum of all numbers from 1 to %d is: %d",n, sum);
    }
}
