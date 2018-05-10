import java.util.Scanner;

public class Problem04CalculateExpression {
    public static void main(String[] args) {

        System.out.println("Enter three floating point numbers:");
        Scanner input = new Scanner(System.in);
        System.out.print("a = ");
        double a = input.nextDouble();
        System.out.print("b = ");
        double b = input.nextDouble();
        System.out.print("c = ");
        double c = input.nextDouble();

        double formula1 = Math.pow(
                ((a * a) + (b * b)) / ((a * a) - (b * b)),
                (a + b + c) / Math.sqrt(c));

        double formula2 = Math.pow(
                ((a * a) + (b * b) - (c * c * c)),
                (a - b));

        double difference = Math.abs(average(a, b, c) - average(formula1, formula2));

        System.out.printf("F1 result: %1$.2f; F2 result: %2$.2f; Diff: %3$.2f",
                formula1, formula2, difference);
    }

    private static double average(double... numbers){
        int count = 0;
        double sum = 0;
        for (double number : numbers) {
            sum += number;
            count++;
        }

        return sum / count;
    }
}
