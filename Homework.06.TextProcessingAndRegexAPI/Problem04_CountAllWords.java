import java.util.Scanner;

public class Problem04_CountAllWords {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] text = input.nextLine().split("\\W+");

        System.out.println(text.length);
    }
}
