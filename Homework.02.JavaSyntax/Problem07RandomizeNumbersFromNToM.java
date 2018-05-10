import java.util.Random;
import java.util.Scanner;

public class Problem07RandomizeNumbersFromNToM {
    public static void main(String[] args) {
        // Write a program that takes as input two integers N and M,
        // and randomizes the numbers between them.
        // Note that M may be smaller than or equal to N.

        System.out.println("Enter two integers N and M:");
        Scanner input = new Scanner(System.in);
        System.out.print("n = ");
        int n = input.nextInt();
        System.out.print("m = ");
        int m = input.nextInt();
        Random random = new Random();

        int max = n;
        int min = m;
        if (min > max) {
            max = m;
            min = n;
        }

        System.out.print("Random numbers between them: ");
        for (int i = 0; i <= max - min; i++) {
            int randomNumber = random.nextInt(max - min + 1) + min;
            System.out.print(randomNumber + " ");
        }
    }
}
