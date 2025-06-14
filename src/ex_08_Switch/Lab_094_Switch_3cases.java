package ex_08_Switch;
public class Lab_094_Switch_3cases {
    public static void main(String[] args) {

        int itenNumber =102;

        switch (itenNumber){
            case 100:
                System.out.println("Item number 100");
                break;
            case 101,102,103:
                System.out.println("Item number 101/102/103");
                break;
            default:
                System.out.println("Default value");
                break;
        }
    }
}

