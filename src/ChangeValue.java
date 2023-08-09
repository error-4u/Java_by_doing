import java.lang.reflect.Array;
import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int [] arr = {1, 5, 3, 7, 8};
        changearr(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void changearr(int [] num){

        num[2] = 20; // if you make change via ref var to the object the main object will be change


    }
}
