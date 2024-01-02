package Problem_solving;

import java.util.Scanner;

public class UpperCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        String upperCaseString = convertToUpperCase(inputString);


        System.out.println("Uppercase String: " + upperCaseString);
    }

    static String convertToUpperCase(String inputString) {
        char[] charArray = inputString.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
      
            if (charArray[i] >= 'a' && charArray[i] <= 'z') {

                charArray[i] = (char) (charArray[i] - 'a' + 'A');
            }
        }

        return new String(charArray);
    }
}
