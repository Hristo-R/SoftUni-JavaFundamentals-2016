import java.util.Scanner;

public class Problem01RectangleArea {
    public static void main(String[] args) {
        // Write a program that enters the sides of a rectangle (two integers a and b)
        // and calculates and prints the rectangle's area. Examples:
        //        Input	Output
        //        7 20	140
        //        5 12	60

        System.out.println("Enter the sides of a rectangle:");
        Scanner input = new Scanner(System.in);
        System.out.print("a = ");
        int sideA = input.nextInt();
        System.out.print("b = ");
        int sideB = input.nextInt();

        System.out.printf("The rectangle's area is %d", sideA * sideB);
    }
}