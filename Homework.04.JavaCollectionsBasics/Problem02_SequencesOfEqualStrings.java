import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem02_SequencesOfEqualStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] stringArray = input.nextLine().split(" ");
        LinkedHashMap<String, Integer> result = new LinkedHashMap<>();

        for (String string : stringArray) {
            if (!result.containsKey(string)) {
                result.put(string, 1);
            } else {
                result.put(string, result.get(string) + 1);
            }
        }

        for (Map.Entry<String, Integer> pair : result.entrySet()){
            for (int i = 0; i < pair.getValue(); i++) {
                System.out.print(pair.getKey() + " ");
            }
            System.out.println();
        }
    }
}