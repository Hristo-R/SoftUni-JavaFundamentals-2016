import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem02_CountSubstringOccurrences {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String text = input.nextLine().toLowerCase();
        String searchString  = input.nextLine().toLowerCase();
        String patternString = "(?=" + searchString + ")";

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);
        int count = 0;

        while (matcher.find()){
            count ++;
        }

        System.out.println(count);
    }
}
