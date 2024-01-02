package Problem_solving;
import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.println("Enter the distance in kilometers:");
        double kilometers = scanner.nextDouble();

        // Convert to meters and centimeters
        double meters = convertToKilometersToMeters(kilometers);
        double centimeters = convertToKilometersToCentimeters(kilometers);

        // Output
        System.out.println("Distance in meters: " + (int)meters);
        System.out.println("Distance in centimeters: " + (int)centimeters);
    }

    static double convertToKilometersToMeters(double kilometers) {
        return kilometers * 1000;
    }

    static double convertToKilometersToCentimeters(double kilometers) {
        return kilometers * 100000;
    }
}

