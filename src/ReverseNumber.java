import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
         int ans = 0;
         while(num > 0) {
             int r = num % 10;

             ans = ans * 10 + r;

             num = num / 10;
         }
             System.out.println(ans);


    }
}
