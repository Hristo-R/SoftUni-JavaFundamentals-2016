import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem06_StartsAndEndsWithCapitalLetter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] text = input.nextLine().split("\\s+");
        Pattern pattern = Pattern.compile("\\b[A-Z][a-zA-Z]*[A-Z]\\b");

        for (String string : text) {
            Matcher matcher = pattern.matcher(string);
            if (matcher.find()){
                System.out.print(matcher.group() + " ");
            }
        }
    }
}
