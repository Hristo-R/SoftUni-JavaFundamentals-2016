import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Problem04_CopyJpgFile {
    public static void main(String[] args) {
        try(
                FileInputStream input =
                        new FileInputStream("resources/Problem04_CopyJpgFile/Whacky-Packman-4-300x180.jpg");
                FileOutputStream output =
                        new FileOutputStream("resources/Problem04_CopyJpgFile/my-copied-picture.jpg")
        ){
            byte[] buffer = new byte[1024];
            while (true) {
                int bytes = input.read(buffer);
                if (bytes == -1) break;
                output.write(buffer, 0, bytes);
            }
        }
        catch(IOException ioe){
            System.out.println(ioe.toString());
        }
    }
}
