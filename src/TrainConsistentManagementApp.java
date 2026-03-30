import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Bogie {
    private String name;
    private int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }
}

public class TrainConsistentManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create a list of passenger bogies
        List<Bogie> passengerBogies = new ArrayList<>();

        // Add bogies with capacities
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 60));
        passengerBogies.add(new Bogie("First Class", 50));

        // Sort bogies by capacity in descending order
        passengerBogies.sort(Comparator.comparingInt(Bogie::getCapacity).reversed());

        // Display sorted bogies
        System.out.println("\nPassenger Bogies sorted by capacity (high to low):");
        for (Bogie bogie : passengerBogies) {
            System.out.println("Bogie: " + bogie.getName() + " | Capacity: " + bogie.getCapacity());
        }
    }
}