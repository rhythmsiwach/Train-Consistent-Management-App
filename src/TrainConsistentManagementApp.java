import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TrainConsistentManagementApp{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for Train ID
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainID = scanner.nextLine();

        // Ask user for Cargo Code
        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = scanner.nextLine();

        // Define regex patterns
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        // Compile patterns
        Pattern trainRegex = Pattern.compile(trainPattern);
        Pattern cargoRegex = Pattern.compile(cargoPattern);

        // Match input against patterns
        Matcher trainMatcher = trainRegex.matcher(trainID);
        Matcher cargoMatcher = cargoRegex.matcher(cargoCode);

        // Validate Train ID
        if (trainMatcher.matches()) {
            System.out.println("Valid Train ID: " + trainID);
        } else {
            System.out.println("Invalid Train ID: " + trainID);
        }

        // Validate Cargo Code
        if (cargoMatcher.matches()) {
            System.out.println("Valid Cargo Code: " + cargoCode);
        } else {
            System.out.println("Invalid Cargo Code: " + cargoCode);
        }

        scanner.close();
    }
}