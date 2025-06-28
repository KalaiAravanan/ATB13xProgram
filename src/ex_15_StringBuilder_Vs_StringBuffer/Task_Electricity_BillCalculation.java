package ex_15_StringBuilder_Vs_StringBuffer;
import java.util.Scanner;

public class Task_Electricity_BillCalculation {
    public static void main(String[] args) {
        /* :- take the input from the user of Units.
        Implement Rate Structure:
        Define the rate structure for calculating the bill based on the number of units
         consumed.
         :- First 100 units: 0.50Rs per unit
         :- Next 100 units (101-200): 0.75Rs per unit
         :- Next 100 units (201-300): 1.20Rs per unit
         :- Above 300 units: 1.50Rs per unit */

        double cost = 0;
        System.out.println("Enter Total Units used: ");
        Scanner scanner = new Scanner(System.in);
        int totalUnits = scanner.nextInt();
        if (totalUnits <= 0) {
            System.out.println("Enter valid Total Units");
        }
        else if (totalUnits <= 100) {
            cost = totalUnits * .50;
        }
        else if ((totalUnits > 101) && (totalUnits <= 200)) {
            cost = ((100 * 0.5) + ((totalUnits - 100) * 0.75));
        }
        else if ((totalUnits > 201) && (totalUnits <= 300)) {
            cost =  (100 * 0.5) + ((totalUnits - 100) * 0.75) + ((totalUnits - 200) * 1.20);
        }
        else if (totalUnits > 301) {
            cost =  (100 * 0.5) + ((totalUnits - 100) * 0.75) + ((totalUnits - 200) * 1.20) +  ((totalUnits - 200) * 1.50);
        }
        System.out.println("Electric Bill cost is: " + cost);
    }
}
