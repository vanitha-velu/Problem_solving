package Problem_solving;

import java.util.Scanner;

public class EqualNumber { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   
        System.out.println("Enter the side of the equilateral triangle:");
        double side = scanner.nextDouble();

  
        double area = calculateEquilateralTriangleArea(side);

   
        System.out.printf("Area of the equilateral triangle: %.2f%n", area);
    }

    static double calculateEquilateralTriangleArea(double side) {
        return (Math.sqrt(3) / 4) * Math.pow(side, 2);
    }
}
