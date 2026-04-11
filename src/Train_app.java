import java.util.LinkedHashSet;
import java.util.Set;

public class Train_app {
    public static void main(String[] args) {
        Set<String> trainFormation = new LinkedHashSet<>();

        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        trainFormation.add("Sleeper");

        System.out.println("Train Formation: " + trainFormation);
    }
}