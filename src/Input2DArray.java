import java.util.Arrays;
import java.util.Scanner;

public class Input2DArray {
    public static void main(String[] args) {

        int[][] arr = new int[5][3];
        Scanner in = new Scanner(System.in);
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < 2; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        for (int row = 0; row < arr.length ; row++) {

                System.out.println(Arrays.toString(arr[row]));

        }



    }
//        int[][] arr = new int[2][2];
//        Scanner in = new Scanner(System.in);
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < 2 ; col++) {
//                arr[row][col] = in.nextInt();
//
//            }
//
//
//
//           }
//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }
//
//    }
}
