public class Countnumber {
    public static void main(String[] args){
        int n = 99572;

        int count = 0;
        while(n > 0){
            // calculate last number
            int remainder = n % 10;
            if( remainder == 9){
                count ++;
            }
            n = n / 10;

        }
        System.out.println(count);


    }
}
