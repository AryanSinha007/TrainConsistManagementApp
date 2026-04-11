import java.util.HashSet;
import java.util.Set;

public class Train_app {

    public static void main(String[] args) {

        Set<String> bogieIDs = new HashSet<>();

        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG101");
        bogieIDs.add("BG103");
        bogieIDs.add("BG102");

        System.out.println("Unique Bogie IDs: " + bogieIDs);

        System.out.println("Bogie ID tracking completed successfully.");
    }
}