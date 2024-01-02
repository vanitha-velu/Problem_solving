package Problem_solving;

import java.util.Scanner;

public class CartPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   
        System.out.println("Enter the number of items in the cart:");
        int numItems = scanner.nextInt();

  
        int totalPrice = calculateTotalPrice(scanner, numItems);


        System.out.println(totalPrice + " INR");
    }

    static int calculateTotalPrice(Scanner scanner, int numItems) {
        int total = 0;

        for (int i = 0; i < numItems; i++) {
            System.out.println("Enter item details (code quantity):");
            char code = scanner.next().charAt(0);
            int quantity = scanner.nextInt();

            int itemPrice = getItemPrice(code) * quantity;
            total += itemPrice;
        }

        return total;
    }

    static int getItemPrice(char code) {
        switch (code) {
            case 'M':
                return 500;
            case 'J':
                return 3000;
            case 'T':
                return 1500;
            case 'P':
                return 10;
            default:
                return 0;
        }
    }
}
