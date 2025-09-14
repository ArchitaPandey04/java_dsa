// APPROACH 1ST -run a loop reverse
// 2nd - loop run till half index and then swap it from equivalent index
// 3rd - 

import java.util.Scanner;


public class Reversearray {
    public static void reverseArray(int[] arr) {

         

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("enter the array value one by one : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        reverseArray(arr);
        for (int value : arr) {
            System.out.print(value + "  \t ");
        }
        sc.close();

    }
}


// the TIME COMPLEXITY - O(n)