import java.util.Arrays;

public class bubblesort1 {

    public static void main(String[] args) {
        
        int[] arr = {6,32,4,1,5,6,3,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){
        boolean swapped;
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++){
            swapped = false;
            // for each steps , max item will come at the last respective index
            for (int j = 1; j <= arr.length - i-1 ; j++){
                // swap if the item is smaller then the previous item
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr [j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }

            // if you did not swap for a particular value of i , it means the arrray is sorted hence stop the program
            if( !swapped) {
                break;
            }
        }
    }
}