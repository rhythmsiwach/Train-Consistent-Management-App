import java.util.*;
import java.util.stream.*;

class PassengerBogie {
    String name;
    int capacity;

    public PassengerBogie(String name, int capacity) {
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
        // Step 1: Create a collection of passenger bogies
        List<PassengerBogie> bogies = Arrays.asList(
                new PassengerBogie("Sleeper", 72),
                new PassengerBogie("AC Chair", 56),
                new PassengerBogie("First Class", 40),
                new PassengerBogie("Sleeper", 72),
                new PassengerBogie("AC Chair", 56)
        );

        // Step 2: Loop-based filtering for bogies with capacity > 60
        long loopStart = System.nanoTime();
        List<PassengerBogie> loopFiltered = new ArrayList<>();
        for (PassengerBogie bogie : bogies) {
            if (bogie.capacity > 60) {
                loopFiltered.add(bogie);
            }
        }
        long loopEnd = System.nanoTime();
        long loopTime = loopEnd - loopStart;

        // Step 3: Stream-based filtering for bogies with capacity > 60
        long streamStart = System.nanoTime();
        List<PassengerBogie> streamFiltered = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());
        long streamEnd = System.nanoTime();
        long streamTime = streamEnd - streamStart;

        // Step 4: Display results
        System.out.println("Loop-based filtered bogies: " + loopFiltered);
        System.out.println("Stream-based filtered bogies: " + streamFiltered);
        System.out.println("Loop execution time (ns): " + loopTime);
        System.out.println("Stream execution time (ns): " + streamTime);
    }
}