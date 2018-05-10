import java.util.Scanner;

public class Problem06ConvertFromBase7ToDecimal {
    public static void main(String[] args) {
        // Write a program that converts from a base-7 number to its decimal representation

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a base-7 number: ");
        String base7numberStr = input.nextLine();
        int decimal = 0;
        for (int i = 0; i < base7numberStr.length(); i++) {
        int base7number = base7numberStr.charAt(base7numberStr.length() - i - 1) - 48;
            decimal += base7number * Math.pow(7, i);
        }
        System.out.println("Decimal: " + decimal);
    }
}
