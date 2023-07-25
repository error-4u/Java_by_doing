import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();

//        switch (fruit){
//            case "mango":
//                System.out.println("king of fruit");
//                break;
//            case "apple":
//                System.out.println("red fruit");
//                break;
//            case "banana":
//                System.out.println("long fruit");
//                break;
//            default:
//                System.out.println("enter valid fruit");

        switch (day){
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");

        }
    }


}
