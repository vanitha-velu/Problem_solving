package Problem_solving;

import java.util.Scanner;
 
public class Invert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

 
        System.out.println("Enter the number of rows:");
        int numRows = scanner.nextInt();

 
        printInvertedPyramid(numRows);
    }

    static void printInvertedPyramid(int numRows) {
        for (int i = 0; i < numRows; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }


            for (int k = 0; k < 2 * (numRows - i) - 1; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

