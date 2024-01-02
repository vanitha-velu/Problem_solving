package Problem_solving;

import java.util.Scanner;

public class TemperatureConvertor { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature in Celsius:");
        double celsius = scanner.nextDouble();

        double fahrenheit = convertToCelsiusToFahrenheit(celsius);
        double kelvin = convertToCelsiusToKelvin(celsius);


        System.out.printf("Temperature in Fahrenheit: %.2f%n", fahrenheit);
        System.out.printf("Temperature in Kelvin: %.2f%n", kelvin);
    }

    static double convertToCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    static double convertToCelsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
}

