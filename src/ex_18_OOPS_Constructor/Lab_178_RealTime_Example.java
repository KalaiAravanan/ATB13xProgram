package ex_18_OOPS_Constructor;

public class Lab_178_RealTime_Example {
    public static void main(String[] args) {
        Person p1 = new Person("AMIT",97654321,"abc");
        System.out.println(p1.name);
        Person p2 = new Person("PRAMOD",98989898,"XYZ");

//        Person p3  = new Person();
//        p3.name  = "Smita";
//        System.out.println(p3.name);

    }
}


class Person {

    String name;
    long phone;
    String address;

    Person(){

    }
    Person(String name_user){
        this.name = name_user;
    }

    Person(String name_user,long phone_user,String address_user){
        this.name = name_user;
        this.address = address_user;
        this.phone = phone_user;
    }
    Person(String name_user,long phone_user){
        this.name = name_user;
        this.phone = phone_user;
    }
}
