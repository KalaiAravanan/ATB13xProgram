package ex_30_Exceptions;

public class Lab_233_Throw_To_Catch_Exception_Anotherway {
    public static void main(String[] args) {
    }
        static void divideByZero(int a ){
            if(a ==0){
                throw new ArithmeticException("Error a == 0");
            }
        }
    }

