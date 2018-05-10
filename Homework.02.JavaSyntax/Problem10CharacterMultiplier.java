import java.util.Scanner;

public class Problem10CharacterMultiplier {
    public static void main(String[] args) {
        // Create a method that takes two strings as arguments and returns the sum of
        // their character codes multiplied (multiply str1.charAt (0) with str2.charAt (0)
        // and add to the total sum). Then continue with the next two characters.
        // If one of the strings is longer than the other, add the remaining character codes
        // to the total sum without multiplication.

        Scanner input = new Scanner(System.in);
        String firstString = input.next("\\w+");
        String secondString = input.next("\\w+");

        System.out.println(sumOfCharacterCodes(firstString, secondString));
    }

    private static int sumOfCharacterCodes(String firstString, String secondString){
        int sum = 0;
        if (firstString.length() > secondString.length()){
            for (int i = 0; i < secondString.length(); i++) {
                sum += firstString.charAt(i) * secondString.charAt(i);
            }
            for (int i = secondString.length(); i < firstString.length(); i++) {
                sum += firstString.charAt(i);
            }

        } else if (firstString.length() < secondString.length()) {
            for (int i = 0; i < firstString.length(); i++) {
                sum += firstString.charAt(i) * secondString.charAt(i);
            }
            for (int i = firstString.length(); i < secondString.length(); i++) {
                sum += secondString.charAt(i);
            }
        } else
        for (int i = 0; i < firstString.length(); i++) {
            sum += firstString.charAt(i) * secondString.charAt(i);
        }

        return sum;
    }
}
