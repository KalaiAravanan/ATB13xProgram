package ex_22_AccessModifiers;

public class Task_Public_Access_Modifiers {
    public static void main(String[] args) {
        /* Demonstrate public Access Modifier
           :- Understand how public methods are accessible from anywhere.
           📝 Instructions:
           1.	Create a class Student with a public method showInfo() that prints "Public Access: Student Info".
           2.	In the main() method, create an object of Student.
           3.	Call showInfo() directly from anywhere like same class, sub class, different class same package,
                in different package it should work without restriction. */
    Student st = new Student();
    st.showInfo();
    }
}


