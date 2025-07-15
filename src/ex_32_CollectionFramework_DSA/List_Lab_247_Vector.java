package ex_32_CollectionFramework_DSA;

import java.util.*;
public class List_Lab_247_Vector {
    public static void main(String[] args) {
        //Vector is very smiliar to Arraylist. Vector has indexing mechanism. Vector is thread safe
        //Vector allows duplicates.

        Vector vr = new Vector<>();
        vr.add("pramod");
        vr.add(null);
        vr.add("dutta");
        vr.add("dutta"); // Duplicate is allowed.
        vr.add(123); // Different data type is allowed.
        //System.out.println(vr);
        //System.out.println(vr.size());

        /* for (int  i=0; i< vr.size(); i++){
            System.out.println(vr.get(i));
        }*/

        Iterator iterator = vr.iterator();
        while(iterator.hasNext()){
                System.out.println(iterator.next());
        }

        //not used much - enumeration
        /*Enumeration<Object> enumeration = v.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        } */

    }
}
