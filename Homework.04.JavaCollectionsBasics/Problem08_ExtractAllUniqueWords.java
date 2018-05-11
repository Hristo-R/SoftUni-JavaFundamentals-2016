import java.util.Scanner;
import java.util.TreeSet;

public class Problem08_ExtractAllUniqueWords {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] inputArr = input.nextLine().toLowerCase().split("[^\\w`]+");
        TreeSet<String> collection = new TreeSet<>();

        for (String string : inputArr) {
            collection.add(string);
        }

        System.out.println(String.join(" ", collection));
    }
}
