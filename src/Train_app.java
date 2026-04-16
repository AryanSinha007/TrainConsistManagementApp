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

    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====================================");
        System.out.println("    Train Consist Management App");
        System.out.println("====================================");

        System.out.println();

        System.out.println("====================================");
        System.out.println("    UC12 - Safet Compliance Check for Goods Bogies");
        System.out.println("====================================");

        System.out.println("====================================");
        System.out.println(" UC12 - Safety Compliance Check for Goods Bogies ");
        System.out.println("====================================\n");

        // Create goods bogie list
        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Hazardous", "Chemicals"));
        goodsBogies.add(new GoodsBogie("General", "Food"));
        goodsBogies.add(new GoodsBogie("Hazardous", "Fuel"));

        // Display bogies
        System.out.println("Goods Bogies:");
        for (GoodsBogie g : goodsBogies) {
            System.out.println(g.type + " -> " + g.cargo);
        }

        // ----- SAFETY CHECK USING STREAM -----

        // Rule: Hazardous bogies should NOT carry "Food"
        boolean isSafe = goodsBogies.stream()
                .allMatch(g -> !(g.type.equalsIgnoreCase("Hazardous")
                        && g.cargo.equalsIgnoreCase("Food")));

        System.out.println();

        if (isSafe) {
            System.out.println("All goods bogies are SAFE");
        } else {
            System.out.println("Safety violation detected!");
        }

        System.out.println();
        System.out.println("UC12 safety compliance completed...");
    }
}