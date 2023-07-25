import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String dep = in.next();

        switch (empID) {
            case 1 -> System.out.println("Vishal kumar");
            case 2 -> System.out.println("Arun kumar");
            case 3 -> {

                System.out.println("Emp 3");
                switch (dep) {
                    case "IT" -> System.out.println("IT DEPARTMENT");
                    case "Management" -> System.out.println("Management");
                    default -> System.out.println("No Department");
                }

            }
            default -> System.out.println("enter correct empID");
        }
    }
}
