package Problem_solving;

import java.util.Scanner;

public class MultipleChecker { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:"); 
        int N = scanner.nextInt();

        String result = checkMultipleOfSeven(N);


        System.out.println(result);
    }

    static String checkMultipleOfSeven(int N) {
        if (N % 7 == 0) {
            return "Yes";
        } else {
            return "No";
        }
    }
}

