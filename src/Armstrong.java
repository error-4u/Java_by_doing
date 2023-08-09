


public class Armstrong{
public static void main( String[] args){

//        int a = 407;
//        boolean ans = isarmstrong(a);
//        System.out.println(ans);

        // to know armstrong number between 100 and 1000
   for (int i = 100; i < 1000 ; i++) {
      if (isarmstrong(i)){
         System.out.println(i);
      }

   }


        }

static boolean isarmstrong(int a){

        int original = a;

        int sum = 0;
        while( a > 0){

        int rem = a % 10; // takes remainder of every number ex in 153 is 3

        a = a / 10; // after taking rem it will decrease the number of digit in a ex 153 the 15 then 1

        sum = sum + rem * rem * rem ;



        }

        if(sum == original){

        return true;



        }

        return false;


        }



















        }