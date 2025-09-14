// Question - move zeros to end

import java.util.Scanner;


public class ZerosEnd {

    // method (not constructor)
    public static void moveZeroToLast(int[] arr) {
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // zero placement should be outside the loop
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }
    }

    // main method (inside class)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the elements of array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // move all zeroes to last
        moveZeroToLast(arr);

        System.out.println("Array after moving zeros:");
        for (int value : arr) {
            System.out.print(value + " ");
        }

        sc.close();
    }
}


// the time complexity is O(n)