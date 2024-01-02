package Problem_solving;

import java.util.Scanner;

public class Geometric {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.println("Enter the second term of GP:");
        double secondTerm = scanner.nextDouble();

        System.out.println("Enter the third term of GP:");
        double thirdTerm = scanner.nextDouble();

        System.out.println("Enter the total number of terms in the series:");
        int n = scanner.nextInt();

  
        double sum = calculateGeometricProgressionSum(secondTerm, thirdTerm, n);
        System.out.printf("Output: %.3f%n", sum);
    }

    static double calculateGeometricProgressionSum(double secondTerm, double thirdTerm, int n) {
        double commonRatio = thirdTerm / secondTerm;

 
        double sum = secondTerm * (1 - Math.pow(commonRatio, n)) / (1 - commonRatio);
        return sum;
    }
}
