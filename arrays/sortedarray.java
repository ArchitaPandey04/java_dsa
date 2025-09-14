import java.util.Scanner;

public class sortedarray {

    public static boolean checkSorted(int arr[]) {

        // assume
        boolean isSorted = true;

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i + 1] < arr[i]) {
                isSorted = false;
            }

            
        }
        return isSorted;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Eneter the elements of array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // checling if the array is sorted or not
        boolean checkResult = checkSorted(arr);
        System.out.println("the array is " + (checkResult ? "" : "not ") + "sorted");
       
        sc.close();

        // it follows linear time complexity O(n)
 }
    
}
