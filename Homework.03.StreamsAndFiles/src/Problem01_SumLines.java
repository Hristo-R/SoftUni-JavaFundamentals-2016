import java.io.*;

public class Problem01_SumLines {
    public static void main(String[] args) {
        try (
                BufferedReader br =
                        new BufferedReader(new FileReader("resources/Problem01_SumLines/lines.txt"));
        ){
            int count = 0;
            String line = br.readLine();
            while ( line != null) {
                for (int i = 0; i < line.length(); i++) {
                    count += line.charAt(i);
                }
                line = br.readLine();
                System.out.println(count);
                count = 0;
            }
        }
        catch (IOException ioe) {
            System.out.println(ioe.toString());
        }
    }
}