public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 3,252,545,14222,3,90};
        int ans = findnum(arr);
        System.out.println(ans);
    }
    static int findnum(int[] arr){
        int count = 0;

        for(int num : arr){
            if (even(num)){
                count ++;
            }
        }
        return count;

    }
    static boolean even(int num){
        int noofdigit =  digit(num);
        if (noofdigit % 2 == 0){
            return true;
        }
        return false;
    }

    static int digit(int num){
        int count = 0;
        while (num > 0){
            count ++;
            num /= 10;
        }

        return count;
    }
}