package ex_18_OOPS_Constructor;

public class Task_StudentConstructor {
    public static void main(String[] args) {

        Student st = new Student();
        System.out.println(st.student_id);
    }
}

class Student {
    String name;
    int student_id = 111;

    // Default Constructor!
    Student (){
        System.out.println("This is Default Constructor - Student ");
    }
}


