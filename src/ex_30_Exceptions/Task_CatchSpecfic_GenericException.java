package ex_30_Exceptions;

public class Task_CatchSpecfic_GenericException {
    public static void main(String[] args) {
        /*📘 Description:
        Try the same code twice — once using catch(Exception e) and once using catch(NullPointerException e).
        Compare output and behavior.*/

        String name=null;
        try {

            name.trim();
        } catch (NullPointerException e) {
            System.out.println("Null pointer Exception : " +  e);;
        }
        try {

            name.trim();
        } catch (Exception e) {
            System.out.println("Generic exception "  + e);;
        }
    }
}
