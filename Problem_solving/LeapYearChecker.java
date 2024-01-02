package Problem_solving;

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the year:");
        int year = scanner.nextInt();

        
        char result = checkLeapYear(year);

      
        System.out.println(result);
    }

    static char checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return 'Y'; 
        } else {
            return 'N'; 
        }
    }
}

