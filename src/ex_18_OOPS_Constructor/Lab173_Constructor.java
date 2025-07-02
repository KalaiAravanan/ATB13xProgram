package ex_18_OOPS_Constructor;

public class Lab173_Constructor {
    public static void main(String[] args) {
        Baby baby = new Baby();
        System.out.println(baby);

    }
}
    class Baby {
        // Attribute | Instance Variable |  Member variables, data members
        String name;

        // Default Constructor!
        Baby(){
            System.out.println("This is Constructor called once the Object is created");
        }
    }


