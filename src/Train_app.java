import java.util.*;
import java.util.stream.Collectors;


public class Train_app {
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====================================");
        System.out.println("    Train Consist Management App");
        System.out.println("====================================");

        System.out.println();

        System.out.println("====================================");
        System.out.println("    UC8 - Sort Bogies by Capacity (Comparator)");
        System.out.println("====================================");

        List<Bogie> bogies = new ArrayList<>();

        System.out.println("Enter bogie name and capacity (Enter 'Exit' to stop):");
        while (true) {
            System.out.println("Bogie Name:");
            String name = sc.nextLine();
            if (name.equalsIgnoreCase("Exit")) {
                break;
            }
            System.out.println("Bogie Capacity:");
            int capacity = sc.nextInt();
            sc.nextLine(); // Consume newline
            bogies.add(new Bogie(name, capacity));
        }

        System.out.println();




        System.out.println("All Bogies");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        System.out.println();

        System.out.println("Filtered Bogeies (Capacity > 60):");
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        for (Bogie b : filteredBogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        System.out.println("UC8 filtering completed...");
    }
}
