import java.util.Scanner;

public class Problem12_CalculateNFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number N = ");
        String inputLine = input.nextLine();
        int n = Integer.parseInt(inputLine);

        long factorial = calculateFactorial(n);
        System.out.printf(n + "! = " + factorial);
    }

    private static long calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        }

        return n * calculateFactorial(n - 1);
    }
}
