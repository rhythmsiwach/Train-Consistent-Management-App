import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 60));
        passengerBogies.add(new Bogie("First Class", 50));

        // Filter bogies with capacity greater than 60
        List<Bogie> highCapacityBogies = passengerBogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        // Display filtered bogies
        System.out.println("\nFiltered Passenger Bogies (Capacity > 60):");
        for (Bogie bogie : highCapacityBogies) {
            System.out.println("Bogie: " + bogie.getName() + " | Capacity: " + bogie.getCapacity());
        }

        // Original list remains unchanged
        System.out.println("\nOriginal Bogie List remains unchanged:");
        for (Bogie bogie : passengerBogies) {
            System.out.println("Bogie: " + bogie.getName() + " | Capacity: " + bogie.getCapacity());
        }
    }
}