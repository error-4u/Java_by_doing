import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuestions {
    public static void main(String[] args) {
        // input and out put of array
//        int [] arr = new int[6];
//        Scanner in = new Scanner(System.in);
//
//        // taking input using for loop
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//
//        }
//        // printing using loop or Arrrays.toString() method
//
//        System.out.println(Arrays.toString(arr));


        // Q2 SWAP NUMBERS IN ARRAY

//        int[] arr = {23,4,52,2,24,44};
//        System.out.println(Arrays.toString(arr));
//        swap(arr, 1,4);
//    }
//
//    static void swap(int[] arr, int num1, int num2){
//       int temp = arr[num2];
//       arr[num2] = arr[num1];
//       arr[num1] = temp;
//        System.out.println(Arrays.toString(arr));
//


        // Q3 PRINT MAX VAUE IN ARRAY

//        int[] arr = { 4644, 2, 26, 5, 646};
//
//
//        System.out.println(max(arr));
//    }
//    static int max(int[] arr) {
//
//        int min = arr[0];
//
//        for (int i = 0; i < arr.length; i++) {
//
//            if (arr[i] < min) {
//
//               min = arr[i] ;
//
//
//            }
//
//        }
//      return min;

//
//        int[] arr ={234,525346,346,574,756,56};
//        reverse(arr);
//        System.out.println(Arrays.toString(arr));
//
//
//
//    }
//
//    static void reverse(int[] arr){
//
//        int start = 0;
//        int end = arr.length-1;
//
//        while(start < end){
//            swap(arr,start,end);
//            start ++;
//            end --;
//
//        }
//    }
//
//    static void swap(int[] arr, int num1, int num2){
//
//        int temp = arr[num1];
//        arr[num1] = arr[num2];
//        arr[num2] = temp;
//

//
//        int[] arr ={234,525346,346,574,756,56};
//        int ans = search(arr, 5747);
//        System.out.println(ans);
//        if(ans == -1){
//            System.out.println("element not found");
//        }
//
//
//
//    }
//
//    static int search(int[] arr, int target) {
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == target) {
//
//                return i;
//
//            }
//
//
//        }
//        return -1;

        // BEST TIME TO BUY ANS SELL STOCKS


        int[] arr = {-1,1,5,3,-6,4};
        int ans = maxProfit(arr);
        System.out.println(ans);

    }
      static int maxProfit(int[] prices) {
                int maxprofit = 0;
                int minval = Integer.MAX_VALUE;
                for(int i =0; i < prices.length; i++){
                    if(minval > prices[i]){
                        minval = prices[i];
                    }
                    else {
                        int profit = prices[i] - minval;
                        if( profit > maxprofit)
                            maxprofit = profit;
                    }



                }
                return maxprofit;
            }

}