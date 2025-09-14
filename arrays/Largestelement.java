// QUESTION - find the largest element in an array

import java.util.*;


public class Largestelement {


    public static int findLargestElement(int arr[]) {
        int largestElement = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestElement) {
                largestElement = arr[i];
            }
        }
        return largestElement;    
    }

    public static void main(String[] args) {
        // when array is known
        // int arr[] = { 20, 45, 23, 11, 67 };

        // Take input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int size = sc.nextInt();

        // defining array and initialisation
        int arr[] = new int[size];
        System.out.println("Enter the array value one by one : ");
        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();


        }

        int largestvalue = findLargestElement(arr);
        System.out.println("largest value is " + largestvalue);
        
        sc.close();

    }
}


// TIME COMPLEXITY - liner time complexity