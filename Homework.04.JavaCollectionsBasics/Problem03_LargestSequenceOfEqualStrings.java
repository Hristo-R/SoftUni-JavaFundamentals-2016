import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem03_LargestSequenceOfEqualStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] inputArr = input.nextLine().split(" ");
        LinkedHashMap<String, Integer> result = new LinkedHashMap<>();

        for (String anInputArr : inputArr) {
            if (!result.containsKey(anInputArr)) {
                result.put(anInputArr, 1);
            } else {
                Integer integer = result.get(anInputArr);
                result.put(anInputArr, integer + 1);
            }
        }

        int largest = 0;
        for (Map.Entry<String, Integer> pair : result.entrySet()){
            if (largest < pair.getValue()){
                largest = pair.getValue();
            }
        }

        for(String key : result.keySet()){
            if(result.get(key) == largest){
                for (int i = 0; i < largest; i++) {
                    System.out.print(key + " ");
                }
                System.out.println();
                return;
            }
        }
    }
}
