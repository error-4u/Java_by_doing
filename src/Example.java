// Function to insert a given key in
// the array. This function returns n+1
// if insertion is successful, else n.
public class Example{
static int insertSorted(int arr[], int arrplace, int key,
        int capacity)
        {

        // Cannot insert more elements if arrplace
        // is already more than or equal to
        // capacity
        if (arrplace >= capacity) {
                return arrplace;
        }
        else {
                arr[arrplace] = key;

                return (arrplace + 1);
        }
        }

// Driver Code
public static void main(String[] args)
        {
        int[] arr = new int[20];
        arr[0] = 1;
        arr[1] = 98;
        arr[2] = 62;
        arr[3] = 60;
        arr[4] = 5;
        arr[5] = 6;
        int capacity = 20;
        int arrplace = 1;

        int i, key = 26;

        System.out.print("Before Insertion: ");
        for (i = 0; i < arrplace; i++) {
                System.out.print(arr[i] + " ");

        }


        int n = insertSorted(arr, arrplace, key, capacity);

        System.out.print("\n After Insertion: ");
        for (i = 0; i < n; i++)
        System.out.print(arr[i] + " ");
        }
}
