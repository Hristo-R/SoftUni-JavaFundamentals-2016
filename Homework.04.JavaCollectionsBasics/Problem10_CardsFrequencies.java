import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem10_CardsFrequencies {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] cards = input.nextLine().split("[^\\w`]+");
        LinkedHashMap<String, Integer> result = new LinkedHashMap<>();
        Double frequency;

        for (String card : cards) {
            if (!result.containsKey(card)) {
                result.put(card, 1);
            } else {
                result.put(card, result.get(card) + 1);
            }
        }

        for (Map.Entry<String, Integer> word : result.entrySet()) {
            frequency = (1.0 * word.getValue()/cards.length) * 100;
            System.out.printf("%s -> %.2f%%%n", word.getKey(), frequency);
        }
    }
}
