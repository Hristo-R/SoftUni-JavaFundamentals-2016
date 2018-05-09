package com.company;

import java.util.Scanner;

public class _05PrintACharacterTriangle {

    public static void main(String[] args) {
        // Create a triangle of characters, based on input. Learn about java.util.Scanner and Integer.parseInt().
        // Test your program with integers up to 26. Think why.

        Scanner input = new Scanner(System.in);
        String inputLine = input.nextLine();
        int n = Integer.parseInt(inputLine);
        char character = 'a';
        int count = 0;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < count; j++) {
                character = (char)((int)'a' + j);
                System.out.print(character + " ");
            }
            count++;
            System.out.println();
        }

        count = n - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < count; j++) {
                character = (char)((int)'a' + j);
                System.out.print(character + " ");
            }
            count--;
            System.out.println();
        }
    }
}
