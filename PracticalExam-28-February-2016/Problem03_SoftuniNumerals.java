import java.math.BigInteger;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem03_SoftuniNumerals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String text = input.nextLine();
        Pattern pattern = Pattern.compile("(aa)|(aba)|(bcc)|(cc)|(cdc)");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            switch (matcher.group()){
                case "aa": sb.append("0");break;
                case "aba": sb.append("1");break;
                case "bcc": sb.append("2");break;
                case "cc": sb.append("3");break;
                case "cdc": sb.append("4");break;
            }
        }

        String base5numberStr = sb.toString();

        BigInteger bigInteger = new BigInteger(base5numberStr, 5);
        System.out.println(bigInteger);
    }
}
