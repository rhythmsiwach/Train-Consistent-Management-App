import java.util.LinkedList;

public class TrainConsistentManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create a LinkedList to represent train consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // Add bogies in sequence
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        // Insert Pantry Car at position 2 (index starts from 0)
        trainConsist.add(2, "Pantry Car");

        System.out.println("\nTrain consist after adding bogies and Pantry Car:");
        for (String bogie : trainConsist) {
            System.out.println(bogie);
        }

        // Remove first and last bogie
        trainConsist.removeFirst();
        trainConsist.removeLast();

        System.out.println("\nFinal Train Consist after removing first and last bogie:");
        for (String bogie : trainConsist) {
            System.out.println(bogie);
        }
    }
}