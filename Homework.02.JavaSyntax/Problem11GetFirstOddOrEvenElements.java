import java.util.ArrayList;
import java.util.Scanner;

public class Problem11GetFirstOddOrEvenElements {
    public static void main(String[] args) {
        // Write a method that returns the first N odd/even elements from a collection.
        // Return as many as you can.
        // Format: [Get <number of elements> <odd/even>]

        ArrayList<Integer> result = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        String[] inputArr = input.nextLine().split(" ");
        int[] arr = new int[inputArr.length];

        for (int i = 0; i < inputArr.length; i++) {
            arr[i] = Integer.parseInt(inputArr[i]);
        }


        String[] command = input.nextLine().split(" ");
        int elements = Integer.parseInt(command[1]);
        String oddOrEven = command[2];

        if (elements > arr.length){
            elements = arr.length;
        }

        result = getFirstNOddOrEvenElements(elements, arr, oddOrEven);
        for (Integer num : result
             ) {
            System.out.print(num + " ");
        }
    }

    private static ArrayList<Integer> getFirstNOddOrEvenElements(int elements, int[] arr, String oddOrEven) {
        ArrayList<Integer> result = new ArrayList<>();
        int count = 0;
        if (oddOrEven.equals("odd")) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0 && count <= elements) {
                    result.add(arr[i]);
                    count++;
                }
            }
        } else if (oddOrEven.equals("even")) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0 && count <= elements) {
                    result.add(arr[i]);
                    count++;
                }
            }
        }

        return result;
    }
}
