import java.io.*;

public class Problem03_CountCharacterTypes {
    public static void main(String[] args) {
        try (
                BufferedReader br =
                        new BufferedReader(new FileReader("resources/Problem03_CountCharacterTypes/words.txt"));
                PrintWriter pw =
                        new PrintWriter("resources/Problem03_CountCharacterTypes/count-chars.txt")
        ){
            int vowels = 0;
            int consonants = 0;
            int punctuation = 0;

            String line = br.readLine();
            while ( line != null) {
                for (int i = 0; i < line.length(); i++) {
                    switch (line.charAt(i)){
                        case 'a':
                        case 'e':
                        case 'i':
                        case 'o':
                        case 'u':
                            vowels++; break;
                        case '!':
                        case ',':
                        case '.':
                        case '?':
                            punctuation++; break;
                        case ' ':
                            break;
                        default:
                            consonants++; break;

                    }
                }
                line = br.readLine();
            }

            pw.println("Vowels: " + vowels);
            pw.println("Consonants: " + consonants);
            pw.println("Punctuation: " + punctuation);
        }
        catch (IOException ioe) {
            System.out.println(ioe.toString());
        }
    }
}