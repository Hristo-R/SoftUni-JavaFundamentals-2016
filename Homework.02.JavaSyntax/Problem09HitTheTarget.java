import java.util.Scanner;

public class Problem09HitTheTarget {
    public static void main(String[] args) {
        System.out.print("Enter a integer: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (arr[i] + arr[j] == num){
                    System.out.printf("%d + %d = %d\n", arr[i], arr[j], num);
                }
            }
        }

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (arr[i] - arr[j] == num){
                    System.out.printf("%d - %d = %d\n", arr[i], arr[j], num);
                }
            }
        }
    }
}
