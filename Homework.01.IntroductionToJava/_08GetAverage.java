package com.company;

import java.util.Scanner;

public class _08GetAverage {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers:");

        System.out.print("a = ");
        String inputA = input.nextLine();
        double a = Double.parseDouble(inputA);

        System.out.print("b = ");
        String inputB = input.nextLine();
        double b = Double.parseDouble(inputB);

        System.out.print("c = ");
        String inputC = input.nextLine();
        double c = Double.parseDouble(inputC);

        double average = getAverage(a, b, c);
        System.out.printf("The average of %1$f, %2$f and %3$f is %4$.2f", a, b, c, average);
    }

    public static double getAverage(double a, double b, double c){
        double average = (a + b + c)/3;
        return average;
    }
}
