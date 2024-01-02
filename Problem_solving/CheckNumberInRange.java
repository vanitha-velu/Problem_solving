package Problem_solving;

import java.util.Scanner;

public class CheckNumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.println("Enter N:");
        int N = scanner.nextInt();

        System.out.println("Enter L and R (separated by space):");
        int L = scanner.nextInt();
        int R = scanner.nextInt();

        String result = checkNumberInRange(N, L, R);
        System.out.println(result);
    }

    static String checkNumberInRange(int N, int L, int R) {
        if (N >= L && N <= R) {
            return "yes";
        } else {
            return "no";
        }
    }
}
