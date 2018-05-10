import java.util.Scanner;

public class Problem05ConvertFromDecimalSystemToBase7 {
    public static void main(String[] args) {
        // Write a program that takes an integer number and converts it to base-7

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int number = input.nextInt();
        int numberToBase7 = Integer.parseInt(convertToBase7(number));
        System.out.println("Converted to base-7: " + numberToBase7);
    }

    private static String convertToBase7(int number) {
        int result = number / 7;
        int remainder = number % 7;

        if(result == 0){
            return Integer.toString(remainder);
        } else {
            return convertToBase7(result) + Integer.toString(remainder);
        }
    }
}
