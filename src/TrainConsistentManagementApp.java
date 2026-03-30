import java.util.ArrayList;
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
        return name + " (" + capacity + " seats)";
    }
}

public class TrainConsistentManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App - UC10 ===");

        // Step 1: Create list of passenger bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 48));
        bogies.add(new Bogie("Sleeper", 72)); // Duplicate bogie for example

        // Display all bogies
        System.out.println("Bogies in train:");
        bogies.forEach(System.out::println);

        // Step 2: Calculate total seating capacity using Stream.reduce()
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)       // Extract capacities
                .reduce(0, Integer::sum);   // Sum all capacities

        // Display total seating capacity
        System.out.println("\nTotal seating capacity of train: " + totalSeats + " seats");
    }
}