package ex_20_OOPs_Polymorphism;

public class Task_Login_PolymOverride {
    public static void main(String[] args) {
        /*•	Description: Create a class User with method login() that prints “User login”.
            Create subclasses AdminUser and RegularUser, each overriding login() with their own logic/messages.
            Demonstrate calling the login() method using base class reference to highlight runtime polymorphism. */

        User ur = new User();
        ur.Login();

        AdminUser au = new AdminUser();
        au.Login();

        RegularUser ru = new RegularUser();
        ru.Login();
    }
}

class User{
    void Login(){
        System.out.println("User Login");
    }
}

class AdminUser extends User{
    void Login(){
        System.out.println("Admin User Login");
    }
}

class RegularUser extends User{
    void Login(){
        System.out.println("Regular User Login");
    }
}