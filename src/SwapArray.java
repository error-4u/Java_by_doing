import java.util.Arrays;
import java.util.Scanner;

public class SwapArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = in.nextInt();
        }

        // input array and swap  array index

        System.out.println(Arrays.toString(arr));
        swap(arr, 0, 4);
        System.out.println(Arrays.toString(arr));


    }
    static void swap(int[] arr, int num1, int num2){
        int temp = arr[num2];
        arr[num2] = arr[num1];
        arr[num1] = temp;



    }
}
