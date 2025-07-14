package ex_28_Enum;

public class ex_210_Enum {
    public static void main(String[] args) {
        System.out.println(days.sunday);
        System.out.println(projects.google);
    }

}

//enum is special data type, used to define set of constants
enum days{ sunday,monday, tuesday, wednesday, thursday, friday, saturday}

enum projects{google,restassured,katalon }

//this below is not good way to store constants and use enum instead
//class A{
//    String[] days = {"Mon","Tue", "Wed", "Thurs","Fri","Sat","Sun"};
//}