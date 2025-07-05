package ex_22_AccessModifiers;

public class Task_Default_Access_Modifiers {
    public static void main(String[] args) {
        /* default (no modifier) access - same package only
        Instructions:
        1.	Create a class Student with a method showDetails() without any access modifier (default).
        2.	In the same file or same package, create a class TestDefault.
        3.	In main(), create an object of Student and call the showDetails() method. */

        student st = new student();
        st.showDetails();
    }
}

class student{
    //showDetails() without any access modifier
    void showDetails(){
        System.out.println("Show details method");
    }
}

class TestDefault{
    void showDefault(){
        System.out.println("Show Test Default method");
    }
}