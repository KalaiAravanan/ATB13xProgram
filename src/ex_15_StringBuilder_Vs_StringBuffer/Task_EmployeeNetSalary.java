package ex_15_StringBuilder_Vs_StringBuffer;

import java.util.Scanner;

public class Task_EmployeeNetSalary {
    public static void main(String[] args) {
        //Salary (Basic Pay, HRA, DA, Tax Deductions,) Reserch from your side for this program.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Basic pay :");
        double basicpay  = sc.nextDouble();
        if(basicpay < 0) {
            System.out.println("salary must be greater than 0");
            return;
        }

        double hra = calculateHra(basicpay);
        double da = calculateDa(basicpay);
        double grossSalary = basicpay + hra + da;
        System.out.println("your gross sal is  :" +grossSalary);


        double pf = calculatePf(basicpay);
        double professionalTax = 200;
        double tds = calculateTds(grossSalary);

        double totalDeduction = pf + professionalTax +tds;
        double netSalary = grossSalary - totalDeduction;
        printSalarySlip(basicpay , hra ,da , professionalTax , tds , pf, grossSalary ,totalDeduction, netSalary);
    }

private static void printSalarySlip(double basicpay, double hra, double da, double professionalTax, double tds, double pf ,double grossSalary , double totalDeductions , double netSalary) {
    System.out.println("---------- SALARY SLIP ----------");
    System.out.println("Basic pay:"+basicpay);
    System.out.println("HRA(40%): "+ hra);
    System.out.println("DA (10%): " +da);
    System.out.println("Gross Salary: " + grossSalary);
    System.out.printf("PF (12%% of Basic): "+pf);
    System.out.printf("Professional Tax : "+professionalTax);
    System.out.printf("TDS (10%% Gross) :" + tds);
    System.out.printf("Total Deductions "+ totalDeductions);
    System.out.printf("✅ Net Salary : "+ netSalary);
}

private static double calculateTds(double grossSalary) {
    return 0.10*grossSalary;
}

private static double calculatePf(double basicpay) {
    return 0.12*basicpay;
}

private static double calculateDa(double basicpay) {
    return 0.40*basicpay;
}

private static double calculateHra(double basicpay) {
    return 0.10*basicpay;
    }
}