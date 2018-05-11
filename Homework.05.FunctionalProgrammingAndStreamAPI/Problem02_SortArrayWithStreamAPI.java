import java.util.*;
import java.util.stream.Collectors;

public class Problem02_SortArrayWithStreamAPI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] inputArray = input.nextLine().split(" ");
        String command = input.nextLine();
        Integer[] intArray = new Integer[inputArray.length];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Integer.parseInt(inputArray[i]);
        }

        if (command.equals("Ascending")) {
            Arrays.stream(intArray)
                    .sorted()
                    .collect(Collectors.toList())
                    .forEach(num -> System.out.print(num + " "));
        } else if (command.equals("Descending")) {
            Arrays.stream(intArray)
                    .sorted((num1, num2) -> num2.compareTo(num1))
                    .collect(Collectors.toList())
                    .forEach(num -> System.out.print(num + " "));;
        }

    }
}
