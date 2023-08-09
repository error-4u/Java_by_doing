import java.util.Arrays;

public class PassinginFunction {
    public static void main(String[] args) {
        int[] roll = {4, 343 , 35, 535, 5, 3 };
        System.out.println(Arrays.toString(roll));
        change(roll);

    }
    static void change(int[] num){
         num[3] = 54;
        System.out.println(Arrays.toString(num));
    }
}
