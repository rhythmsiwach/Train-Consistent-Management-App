import java.util.*;
import java.util.stream.*;

class GoodsBogie {
    String type;
    String cargo;

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return type + " bogie carrying " + cargo;
    }
}

public class TrainConsistentManagementApp {
    public static void main(String[] args) {
        // Step 1: Create list of goods bogies
        List<GoodsBogie> goodsBogies = Arrays.asList(
                new GoodsBogie("Cylindrical", "Petroleum"),
                new GoodsBogie("Rectangular", "Coal"),
                new GoodsBogie("Cylindrical", "Petroleum"),
                new GoodsBogie("Box", "Grain")
        );

        // Step 2: Safety check using stream + allMatch
        boolean isSafe = goodsBogies.stream()
                .allMatch(bogie ->
                        !bogie.type.equalsIgnoreCase("Cylindrical") || bogie.cargo.equalsIgnoreCase("Petroleum")
                );

        // Step 3: Display result
        System.out.println("Train safety compliance check: " + (isSafe ? "SAFE" : "UNSAFE"));

        // Optional: print bogie details
        System.out.println("Goods bogies in train:");
        goodsBogies.forEach(System.out::println);
    }
}