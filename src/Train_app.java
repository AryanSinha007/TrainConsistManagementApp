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


    // ----- CUSTOM EXCEPTION -----
    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    // ----- Passenger Bogie with validation -----
    static class PassengerBogie {
        String name;
        int capacity;

        PassengerBogie(String name, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }
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
        System.out.println("    UC14- Handle Invalid Bogie Capacity)");
        System.out.println("====================================");


        try {
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            System.out.println("Created Bogie: " + b1.name + " -> " + b1.capacity);

            // This will throw exception
            PassengerBogie b2 = new PassengerBogie("AC", -10);
            System.out.println("Created Bogie: " + b2.name + " -> " + b2.capacity);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();
        System.out.println("UC14 exception handling completed...");

    }
}