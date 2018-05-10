import java.io.*;
import java.util.ArrayList;

public class Problem05_SaveAnArrayListOfDoubles {
    public static void main(String[] args) {
        ArrayList<Double> doubles = new ArrayList<Double>(){{
            add(1.2);
            add(22.2);
            add(2.5);
            add(71.66);
            add(0.54);
            add(999.02);
        }};
        ArrayList<Double> newList = new ArrayList<>();

        try (
                ObjectOutputStream oos = new ObjectOutputStream(
                        new FileOutputStream("resources/Problem05_SaveAnArrayListOfDoubles/doubles.list"))
        ){
            for (Double element : doubles) {
                oos.writeDouble(element);
            }
        }
        catch (IOException e) {
            System.out.println(e.toString());
        }

        try (
                ObjectInputStream ois = new ObjectInputStream(
                        new FileInputStream("resources/Problem05_SaveAnArrayListOfDoubles/doubles.list"))
        ){
            for (int i = 0; i < doubles.size(); i++) {
                newList.add(ois.readDouble());
            }
        }
        catch (IOException e) {
            System.out.println(e.toString());
        }

        System.out.println(doubles);
        System.out.println(newList);
    }
}
