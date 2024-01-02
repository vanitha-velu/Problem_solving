package Problem_solving;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.println("Enter a number:");
        int number = scanner.nextInt();


        int sum = calculateSumOfDigits(number);


        System.out.println("Sum of digits: " + sum);
    }

    static int calculateSumOfDigits(int number) {
        int sum = 0;

        for (; number != 0; number /= 10) {
            int digit = number % 10;
            sum += digit;
        }

        return sum;
    }
}

