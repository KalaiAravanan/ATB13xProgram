package ex_32_CollectionFramework_DSA;
import java.util.*;

public class List_Lab_243_ArrayList {
    public static void main(String[] args) {
        List lt = new ArrayList<>();
        lt.add("1"); //0
        lt.add("2"); //1
        lt.add("3"); //2
        lt.add("4"); //3
        lt.add(true); //4
        lt.add("3"); //5

        //System.out.println("List size: " + lt.size());
        //System.out.println(lt.isEmpty());

       // System.out.println(lt.contains("1"));

        //System.out.println(lt.indexOf("3"));
        //System.out.println(lt.lastIndexOf("3"));

          for (int i = 0; i < lt.size(); i++) {
            System.out.println(lt.get(i));
          }
    }
}
