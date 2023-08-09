import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        multiple(10, 20, "vihasdj", "asnda", "");

    }
    static void multiple(int a, int b, String ...x){
        System.out.println(Arrays.toString(x));
    }

}
