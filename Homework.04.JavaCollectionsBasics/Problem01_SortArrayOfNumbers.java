import java.util.Arrays;
import java.util.Scanner;

public class Problem01_SortArrayOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputN = input.nextLine();
        int n = Integer.parseInt(inputN);
        String[] inputArr = input.nextLine().split(" ");
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(inputArr[i]);
        }

        Arrays.sort(numbers);
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
