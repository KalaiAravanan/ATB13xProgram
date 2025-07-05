package ex_23_Super;

public class Task_Access_ParentClass_Constructor {
    public static void main(String[] args) {
        //Program 1: Access parent class constructor using super()
      history hy = new history();
      hy.grade();
    }
}

class subject{
    void grade(){
        System.out.println("Print Subject grade");
    }
     subject(){
        System.out.println("Subject grade");
    }
}

class history extends subject{
    void grade(){
        System.out.println("Print History grade");
    }
    history() {
        super(); //call parent constructor class
    }
}

