package ex_32_CollectionFramework_DSA;

import java.util.ArrayList;
import java.util.Scanner;

public class List_Lab_251_Input_AL {
    public static void main(String[] args) {
        // Multiple inputs from the user and store them in separate
        // names, ages - store them

        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> ages = new ArrayList<>();
        Scanner scanner  = new Scanner(System.in);

        String Inputvaluecheck = "Y";

        while(Inputvaluecheck.equalsIgnoreCase("Y")){
            System.out.println("Enter name");
            String name = scanner.next();
            names.add(name);

            System.out.println("Enter age");
            String age = scanner.next();
            ages.add(age);

            System.out.print("Do you want continue, Enter Y or N");
            Inputvaluecheck = scanner.next();

        }


    }
}
