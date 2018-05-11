import java.util.*;

public class Problem01_CollectResources {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] resourcesArray = input.nextLine().split("\\s+");
        int lines = Integer.parseInt(input.nextLine());

        String[] startAndStep;
        String[] splitResources;
        ArrayList<Integer> resources = new ArrayList<>();
        ArrayList<Integer> newResources = new ArrayList<>();

        for (int i = 0; i < resourcesArray.length; i++) {
            splitResources = resourcesArray[i].split("_");
            switch (splitResources[0]) {
                case "stone":
                case "gold":
                case "wood":
                case "food":
                    if (splitResources.length == 1) {
                        resources.add(1);
                    } else {
                        resources.add(Integer.parseInt(splitResources[1]));
                    }
                    break;
                default:
                    resources.add(0);
            }
        }

        long quantity = 0;
        long maxQuantity = 0;
        int start;
        int step;
        int position;

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < resources.size(); j++) {
                newResources.add(j, resources.get(j));
            }
            startAndStep = input.nextLine().split("\\s+");
            start = Integer.parseInt(startAndStep[0]);
            step = Integer.parseInt(startAndStep[1]);
            position = start;
            while (newResources.get(position) != -1) {
                quantity += newResources.get(position);
                newResources.remove(position);
                newResources.add(position, -1);
                position = (position + step) % newResources.size();
            }
            if (maxQuantity < quantity){
                maxQuantity = quantity;
            }
            quantity = 0;
            newResources.clear();
        }
        System.out.println(maxQuantity);
    }
}