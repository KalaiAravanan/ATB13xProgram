package ex_31_Generics;

import java.util.ArrayList;
import java.util.List;

public class Lab239_ArrayList {
    public static void main(String[] args) {
        List newlist = new ArrayList();
        newlist.add(12);
        newlist.add("Kalai");
        newlist.add(22.45);

        List<Integer> integerList = new ArrayList();
        integerList.add(10);
        // integerList.add("Pramod");

    }
}
