import java.util.Scanner;

public class Problem05_CountAllWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] inputArr = input.nextLine().split("[^\\w`]+");

        System.out.println(inputArr.length);
    }
}
