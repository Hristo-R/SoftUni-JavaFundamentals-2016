import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem07_CombineListsOfLetters {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] firstString = input.nextLine().split(" ");
        String[] secondString = input.nextLine().split(" ");

        ArrayList<Character> firstCharList = new ArrayList<>();
        ArrayList<Character> secondCharList = new ArrayList<>();
        ArrayList<Character> combinedList = new ArrayList<>();

        for (String string : firstString){
            for (Character ch : string.toCharArray()){
                firstCharList.add(ch);
            }
        }

        for (String string : secondString){
            for (Character ch : string.toCharArray()){
                secondCharList.add(ch);
            }
        }

        combinedList.addAll(firstCharList);

        combinedList.addAll(secondCharList
                .stream()
                .filter(ch -> !firstCharList.contains(ch))
                .collect(Collectors.toList()));

        System.out.println(String.join(" ", combinedList
                .stream()
                .map(x -> Character.toString(x))
                .collect(Collectors.toList())));
    }
}