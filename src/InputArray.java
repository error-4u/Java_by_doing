import java.util.Arrays;
import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // for  int

//        int[] arr = new  int[5];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//        for (int j = 0; j < arr.length; j++) {
//            System.out.println(arr[j] + " ");
//        }

        String[] names = new String[5];
        for (int i = 0; i < names.length; i++) {
            names[i] = in.next();

            names[3] = "vishal";
        }

        System.out.println(Arrays.toString(names));
    }
}
