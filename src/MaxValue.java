import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        int[] arr =new int[6];
        Scanner in = new Scanner(System.in);


        // inputing arrar and checking for max value

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(max(arr));
    }
    static int max(int arr[]){
        int maxval = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > maxval){
                maxval = arr[i];
            }

        }
        return maxval;
    }
}
