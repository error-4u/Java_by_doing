public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 5, 6},
                {856, 2, 35, 46},
                {35,658,22,35}

        };
      boolean ans =  pp( arr, 999);
        System.out.println(ans);


    }
    static boolean pp(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col <arr[row].length ; col++) {
                if(arr[row][col] == target){
                    return true;

                }


            }
        }
        return false;

    }


}
