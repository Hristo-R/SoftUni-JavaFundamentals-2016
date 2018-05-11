import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Problem09_MostFrequentWord {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] text = input.nextLine().toLowerCase().split("[^\\w`]+");
        TreeMap<String, Integer> words = new TreeMap<>();

        for (String word : text){
            if (!words.containsKey(word)){
                words.put(word, 1);
            } else {
                words.put(word, words.get(word) + 1);
            }
        }

        int frequent = 0;
        for (Map.Entry<String, Integer> word : words.entrySet()){
            if (frequent < word.getValue()){
                frequent = word.getValue();
            }
        }

        for(Map.Entry<String, Integer> word : words.entrySet()){
            if(word.getValue() == frequent){
                System.out.println(word.getKey() + " -> " + word.getValue() + " times");
            }
        }
    }
}
