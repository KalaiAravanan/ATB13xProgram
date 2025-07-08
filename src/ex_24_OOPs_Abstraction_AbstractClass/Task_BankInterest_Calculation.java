package ex_24_OOPs_Abstraction_AbstractClass;

public class Task_BankInterest_Calculation {
    public static void main(String[] args) {
        /* •	Description: Abstract class Bank with abstract method getInterestRate(). Classes SBI and HDFC implement it.
                🔶 Expected Output:
                SBI Interest Rate: 6.5%
                HDFC Interest Rate: 7.0% */

        SBI sb = new SBI();
        sb.getInterestRate();
        HDFC hc = new HDFC();
        hc.getInterestRate();
    }
}

abstract class Bank{
    abstract void getInterestRate();
}

class SBI extends Bank{
    void getInterestRate(){
        System.out.println(" SBI Interest Rate: 6.5%");
    }
}

class HDFC extends Bank{
    void getInterestRate(){
        System.out.println(" HDFC Interest Rate: 7.0%");
    }
}