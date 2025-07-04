package ex_20_OOPs_Polymorphism;

public class Task_EmployeeRoleInfo_PolymOverride {
    public static void main(String[] args) {
    /*•	Description:
        Create a class Employee with method role() printing “General Employee”.
        Create child classes Manager, Clerk, Tester, each overriding role() to print their specific roles.
        Call role() on each object to show how overriding helps in specialization */

     role re = new role();
     re.Employee();

     Clerk ck = new Clerk();
     ck.Employee();

     Tester tr = new Tester();
     tr.Employee();
    }
}

class role{
    void Employee(){
        System.out.println("General Employee");
    }
}

class Clerk extends role{
    void Employee(){
        System.out.println("Clerk");
    }
}

class Tester extends role{
    void Employee(){
        System.out.println("Tester");
    }
}

class Manager extends role{
    void Employee(){
        System.out.println("Manager");
    }
}


