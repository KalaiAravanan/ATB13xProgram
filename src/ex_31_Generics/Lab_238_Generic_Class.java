package ex_31_Generics;

public class Lab_238_Generic_Class {
    public static void main(String[] args) {
         GenericClass gc1 = new GenericClass(10);
        //GenericClass gc1 = new GenericClass();
        //gc1.GenericClass(3);
        GenericClass gc2 = new GenericClass(22.4);
        //GenericClass gc2 = new GenericClass();
        //gc2.GenericClass(22.4);
        // T -> it is placeholder only -> it can be any data type.
    }
}

class GenericClass<T> {
    private T num;

    void GenericClass(T t){
        this.num = num;
    }

    public T getData(){
        return num;
    }

    public void setData(T num){
        this.num = num;
    }
}
