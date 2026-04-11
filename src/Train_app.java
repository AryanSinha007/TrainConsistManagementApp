import java.util.HashMap;
import java.util.Map;

public class Train_app {
    public static void main(String[] args) {
        Map<String, Integer> bogieCapacities = new HashMap<>();

        bogieCapacities.put("Sleeper", 72);
        bogieCapacities.put("AC Chair", 56);
        bogieCapacities.put("First Class", 24);
        bogieCapacities.put("Rectangular Cargo", 1000);
        bogieCapacities.put("Cylindrical Cargo", 800);

        for (Map.Entry<String, Integer> entry : bogieCapacities.entrySet()) {
            System.out.println("Bogie Type: " + entry.getKey() + " | Capacity: " + entry.getValue());
        }
    }
}