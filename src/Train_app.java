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
        System.out.println("    UC11 - Validate Train ID and Cargo Code");
        System.out.println("====================================");

        System.out.print("Enter Train ID (Format: TR-1234): ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code (Format: FR-AB12): ");
        String cargoCode = sc.nextLine();

        // ----- REGEX VALIDATION -----

        // Train ID: TR-1234
        boolean isTrainValid = trainId.matches("TR-\\d{4}");

        // Cargo Code: FR-AB12
        boolean isCargoValid = cargoCode.matches("FR-[A-Z]{2}\\d{2}");

        System.out.println();

        // Display results
        if (isTrainValid) {
            System.out.println("Train ID is VALID");
        } else {
            System.out.println("Train ID is INVALID");
        }

        if (isCargoValid) {
            System.out.println("Cargo Code is VALID");
        } else {
            System.out.println("Cargo Code is INVALID");
        }

        System.out.println();
        System.out.println("UC11 validation completed...");
    }
}