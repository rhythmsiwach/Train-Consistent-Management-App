import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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

    @Override
    public String toString() {
        return name + "(" + capacity + ")";
    }
}

public class TrainConsistentManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // Create list of passenger bogies
        List<Bogie> passengerBogies = new ArrayList<>();
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 60));
        passengerBogies.add(new Bogie("First Class", 50));
        passengerBogies.add(new Bogie("Sleeper", 72)); // duplicate type to show grouping

        // Group bogies by type (name)
        Map<String, List<Bogie>> bogiesByType = passengerBogies.stream()
                .collect(Collectors.groupingBy(Bogie::getName));

        // Display grouped bogies
        System.out.println("\nPassenger Bogies grouped by type:");
        bogiesByType.forEach((type, bogies) -> {
            System.out.println(type + " : " + bogies);
        });

        // Original list remains unchanged
        System.out.println("\nOriginal Bogie List remains unchanged:");
        passengerBogies.forEach(b ->
                System.out.println("Bogie: " + b.getName() + " | Capacity: " + b.getCapacity())
        );
    }
}