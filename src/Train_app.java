import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Bogie: " + name + " | Capacity: " + capacity;
    }
}

public class Train_app {
    public static void main(String[] args) {
        List<Bogie> passengerBogies = new ArrayList<>();

        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair Car", 56));
        passengerBogies.add(new Bogie("First Class", 24));
        passengerBogies.add(new Bogie("General", 90));

        System.out.println("--- Before Sorting (Unordered) ---");
        for (Bogie b : passengerBogies) System.out.println(b);

        // Sorting using Comparator (Ascending Order of Capacity)
        passengerBogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\n--- After Sorting by Capacity (Low to High) ---");
        for (Bogie b : passengerBogies) {
            System.out.println(b);
        }

        // Sorting in Descending Order for high-capacity planning
        passengerBogies.sort((b1, b2) -> Integer.compare(b2.capacity, b1.capacity));

        System.out.println("\n--- After Sorting by Capacity (High to Low) ---");
        for (Bogie b : passengerBogies) {
            System.out.println(b);
        }
    }
}