import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem01_FilterArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] inputArray = input.nextLine().split(" ");

        List<String> result = Arrays.stream(inputArray)
                .filter(s -> s.length() > 3).collect(Collectors.toList());

        if (result.size() == 0) {
            System.out.println("(empty)");
        } else {
            System.out.println(String.join(" ", result));
        }
    }
}
