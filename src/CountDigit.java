public class CountDigit {
    public static void main(String[] args) {
        int[] arr = {32,23,647,6};
       int ans = count(arr);
        System.out.println(ans);
    }
    static int count(int[] arr){
        int i = 0;
        for(int num : arr){
//            num = num / 10;
            i ++;
        }
        return i;

    }


    }

