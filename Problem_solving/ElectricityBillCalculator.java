package Problem_solving;
import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the units consumed:");
        int unitsConsumed = scanner.nextInt();


        int electricityBill = calculateElectricityBill(unitsConsumed);


        System.out.println("Electricity Bill: Rs." + electricityBill);
    }

    static int calculateElectricityBill(int unitsConsumed) {
        int costPerUnit;
        int extraCharge = 0;

        if (unitsConsumed <= 200) {
            costPerUnit = 50; 
        } else if (unitsConsumed <= 400) {
            costPerUnit = 65; 
            extraCharge = 100;
        } else if (unitsConsumed <= 600) {
            costPerUnit = 80; 
            extraCharge = 200;
        } else {
            costPerUnit = 125; 
            extraCharge = 425;
        }

        return costPerUnit * unitsConsumed + extraCharge;
    }
}
