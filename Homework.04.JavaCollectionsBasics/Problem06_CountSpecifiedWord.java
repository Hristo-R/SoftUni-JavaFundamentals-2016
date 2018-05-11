import java.util.Scanner;

public class Problem06_CountSpecifiedWord {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] inputArr = input.nextLine().toLowerCase().split("[^\\w`]+");
        String word = input.nextLine().toLowerCase();
        int count = 0;

        for (String string : inputArr) {
            if (string.equals(word)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
