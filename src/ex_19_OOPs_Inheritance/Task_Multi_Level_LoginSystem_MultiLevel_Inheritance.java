package ex_19_OOPs_Inheritance;

public class Task_Multi_Level_LoginSystem_MultiLevel_Inheritance {
    public static void main(String[] args) {
        /* 📄 Description: (Multilevel Inheritance)
             Create a class User with a method login().
             Extend it with a class AdminUser that adds a method accessAdminPanel().
             Then create a SuperAdmin class that extends AdminUser and adds a method shutdownSystem().
             Use an object of SuperAdmin to call all three methods.*/

        SuperAdmin sa = new SuperAdmin();
        sa.login();
        sa.accessAdminPanel();
        sa.shutdownSystem();
    }
}

class User{
    void login(){
        System.out.println("Login method - User " );
    }
}

class AdminUser extends User{
    void accessAdminPanel(){
        System.out.println("AccessAdminPanel method- Admin User");
    }
}

class SuperAdmin extends AdminUser{
    void shutdownSystem(){
        System.out.println("ShutdownSystem method - Super Admin User");
    }
}
