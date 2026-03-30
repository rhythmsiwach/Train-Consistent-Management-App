import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistentManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create LinkedHashSet to represent train formation
        Set<String> trainFormation = new LinkedHashSet<>();

        // Attach bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to attach duplicate bogie
        trainFormation.add("Sleeper"); // duplicate, will be ignored

        // Display final formation
        System.out.println("\nFinal Train Formation (insertion order preserved, duplicates ignored):");
        for (String bogie : trainFormation) {
            System.out.println(bogie);
        }
    }
}
