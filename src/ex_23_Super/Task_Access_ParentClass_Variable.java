package ex_23_Super;

public class Task_Access_ParentClass_Variable {
    public static void main(String[] args) {
        //Program 3: Access parent class variable using super
        smalltrees fs = new smalltrees();
       // int count = fs.tree_count;
        System.out.println("Tree count from Parent class : " + fs.tree_count);

    }
}

class trees{
    int tree_count =10;

    trees(){
        System.out.println("Plants class constructor");
    }

    void water(){
        System.out.println("Water plants");
    }
}

class smalltrees extends trees{
    int treecount= super.tree_count;
    void water(){
        System.out.println("Water plants");
    }
}