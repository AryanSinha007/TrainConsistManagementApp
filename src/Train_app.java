import java.util.ArrayList;
import java.util.List;

public class Train_app {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");


        List<String> passengerBogies = new ArrayList<>();



        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");



        System.out.println("Passenger bogies after addition: " + passengerBogies);


        passengerBogies.remove("AC Chair");



        boolean hasSleeper = passengerBogies.contains("Sleeper");
        System.out.println("Does Sleeper bogie exist? " + hasSleeper);


        System.out.println("Passenger bogies after removal: " + passengerBogies);

        System.out.println("Train consist updated successfully.");
    }
}