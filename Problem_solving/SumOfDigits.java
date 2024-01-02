package Problem_solving;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number:");
        long number = scanner.nextLong();
 

        long result = calculateSumOfDigitsPower(number);

 
        System.out.println("Output: " + result);
    }

    static long calculateSumOfDigitsPower(long number) {
        int numDigits = String.valueOf(number).length();
        long sum = 0;
        long temp = number;

        while (temp > 0) {
            long digit = temp % 10;
            sum += Math.pow(digit, numDigits);
            temp /= 10;
        }

        return sum;
    }
}
