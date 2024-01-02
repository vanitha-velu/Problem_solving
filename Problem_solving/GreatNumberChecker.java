package Problem_solving;

import java.util.Scanner;

public class GreatNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.println("Enter a 2-digit positive number:");
        int n = scanner.nextInt();

        
        String result = checkGreatNumber(n);

       
        System.out.println(result);
    }

    static String checkGreatNumber(int n) {
        int digit1 = n / 10;
        int digit2 = n % 10;

        int sumOfDigits = digit1 + digit2;
        int productOfDigits = digit1 * digit2;

        if (sumOfDigits + productOfDigits == n) {
            return "Great";
        } else {
            return "No";
        }
    }
}

