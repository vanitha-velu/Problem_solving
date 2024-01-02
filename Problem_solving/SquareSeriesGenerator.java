package Problem_solving;

import java.util.Scanner;

public class SquareSeriesGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.println("Enter the value of 'n':");
        int n = scanner.nextInt();

   
        generateSquareSeries(n);
    }

    static void generateSquareSeries(int n) {
        System.out.println("Generated Series:");

        for (int i = 1; i <= n; i++) {
            int term = i * i;
            System.out.print(term);

            if (i < n) {
                System.out.print(", ");
            }
        }
    }
}
