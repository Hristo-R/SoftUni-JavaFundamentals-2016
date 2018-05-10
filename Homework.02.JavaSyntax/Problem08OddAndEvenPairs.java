import java.util.Scanner;

public class Problem08OddAndEvenPairs {
    public static void main(String[] args) {

        // You are given an array of integers as a single line, separated by a space.
        // Write a program that checks consecutive pairs and prints if both are odd/even or not.
        // Note that the array length should also be an even number

        // 2 8 11 15 3 2  =>    2, 8 -> both are even
        //                      11, 15 -> both are odd
        //                      3, 2 -> different

        Scanner input = new Scanner(System.in);
        String[] inputArr = input.nextLine().split(" ");
        Integer[] arr = new Integer[inputArr.length];

        for (int i = 0; i < inputArr.length; i++) {
            arr[i] = Integer.parseInt(inputArr[i]);
        }

        if (inputArr.length %2 == 0) {
            for (int i = 0; i < inputArr.length - 1; i += 2) {
                if (arr[i] % 2 == 0 && arr[i + 1] % 2 == 0) {
                    System.out.printf("%d, %d -> both are even\n", arr[i], arr[i + 1]);
                } else if (arr[i] % 2 != 0 && arr[i + 1] % 2 != 0) {
                    System.out.printf("%d, %d -> both are odd\n", arr[i], arr[i + 1]);
                } else {
                    System.out.printf("%d, %d -> different\n", arr[i], arr[i + 1]);
                }
            }
        } else {
            System.out.println("Invalid length");
        }
    }
}
