import java.util.Scanner;

public class BinarySearch {

    public static int binarysearch(int arr[], int target) {

        int low = 0;
        int high = arr.length - 1;
        int i = 1;

        while (low <= high) {
            // how many times loop runs
            System.out.println("pass " + i);
            i++;

            // find mid element
            int midIndex = low + (high - low) / 2;

            if (arr[midIndex] == target) {
                return midIndex;
            }
            if (target < arr[midIndex]) {
                high = midIndex - 1;
            }
            if (target > arr[midIndex]) {
                low = midIndex + 1;
            }
        }

        return -1;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the size of array: ");

        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("enter then array value one by one: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // input target element
        System.out.println("enter the target element: ");
        int target = sc.nextInt();

        // calling binary search

        int foundIndex = binarysearch(arr, target);
        if (foundIndex == -1) {
            System.out.println("Elemnt not found");
        }
        else {
            System.out.println("elemnt found at index:" + foundIndex);
        }

        sc.close();

    }
}