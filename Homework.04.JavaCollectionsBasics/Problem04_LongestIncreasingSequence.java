import java.util.*;
import java.util.stream.Collectors;

public class Problem04_LongestIncreasingSequence {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] inputArr = input.nextLine().split(" ");
        int[] numbers = new int[inputArr.length];
        for (int i = 0; i < inputArr.length; i++) {
            numbers[i] = Integer.parseInt(inputArr[i]);
        }

        LinkedHashMap<Integer, TreeSet<Integer>> result = new LinkedHashMap<>();
        int key = 0;
        HashSet<Integer> sequence = new HashSet<>();
        Collection<Integer> longestSequence = sequence;
        result.put(key, new TreeSet<>());

        for (int i = 0; i < numbers.length - 1; i++) {
            result.get(key).add(numbers[i]);
            if (numbers[i] < numbers[i + 1]){
                result.get(key).add(numbers[i + 1]);
            } else {
                key++;
                result.put(key, new TreeSet<>());
            }
        }

        if(numbers[numbers.length - 1] < numbers[numbers.length - 2]) {
            result.get(key).add(numbers[numbers.length - 1]);
        }

        for (Map.Entry<Integer, TreeSet<Integer>> pair : result.entrySet()) {
            System.out.println(String.join(" ", pair.getValue()
                    .stream().map(x -> Integer.toString(x)).collect(Collectors.toList())));
        }

        for (Collection<Integer> value : result.values()) {
            if (longestSequence.size() < value.size()){
                longestSequence = value;
            }
        }

        System.out.println("Longest: " + String.join(" ", longestSequence
                .stream().map(x -> Integer.toString(x)).collect(Collectors.toList())));
    }
}
