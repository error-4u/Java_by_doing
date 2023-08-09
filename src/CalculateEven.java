public class CalculateEven {

    public static void main(String[] args) {
        int[] arr = {34, 3,53 ,3536,
                3,53 ,3536,3,53 ,3536,3,53 ,3536,3,53 ,3536,3,53 ,3536,3,53 ,3536,3,53 ,3536,
                3,53 ,3536,3,53 ,3536,3,53 ,3536,3,53 ,3536,
                3,53 ,3536,3,53 ,3536,3,53 ,3536,3,53 ,3536,

        };
        System.out.println(IsEven(arr));

    }
//    static boolean IsEven(int[] arr){
//        int noofdigit = count(arr);
//        if (noofdigit % 2 == 0){
//        return true;
//        }
//        return false;
//    }
//    static int count(int[] arr){
//        int count = 0;
//        for(int num : arr){
//            count ++;
//            num = num / 10;
//            System.out.println(count);
//        }
//        return count;
//    }
//
      static boolean IsEven(int[] arr){
        for(int num : arr){
            int count = 0;
            if(num % 2 == 0){
                num = num /10 ;
                count ++;
                return true;
            }

        }
        return false;
    }



}

