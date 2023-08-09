import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = new int[4];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr ){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            swap(arr, start, end);
            start ++;
            end --;
        }
    }

    static void swap(int[] arr, int i1, int i2){
        int temp = arr[i1];
         arr[i2] = temp;
        arr[i1] = arr[i2];


    }
}
