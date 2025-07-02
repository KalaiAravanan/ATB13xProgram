package ex_18_OOPS_Constructor;

public class Task_ParameterizedContructor {
    public static void main(String[] args) {
        employee emp1 = new employee(1000,"C");
        System.out.println(emp1.emp_id);
        System.out.println(emp1.emp_type);
    }
}

 class employee{
    int emp_id;
    String emp_type;

    employee(){
        System.out.println("Default Constructor - with no parameter");
    }

     employee(int id, String type){
        this.emp_id = id;
        this.emp_type = type;
         System.out.println("Default Constructor - with parameters");
     }
}




