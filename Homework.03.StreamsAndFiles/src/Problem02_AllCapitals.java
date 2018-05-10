import java.io.*;
import java.util.ArrayList;

public class Problem02_AllCapitals {
    public static void main(String[] args) {
        try (
                BufferedReader br =
                        new BufferedReader(new FileReader("resources/Problem02_AllCapitals/lines.txt"))
        ){
            String line = br.readLine();
            ArrayList<String> stringArrayList = new ArrayList<>();

            while (line != null) {
                stringArrayList.add(line.toUpperCase());
                line = br.readLine();
            }
            try (
                    PrintWriter pw =
                            new PrintWriter("resources/Problem02_AllCapitals/lines.txt")
            ){
                stringArrayList.forEach(pw::println);
            }
        }
        catch (IOException ioe) {
            System.out.println(ioe.toString());
        }
    }
}
