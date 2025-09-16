import java.util.Scanner;

public class linearsearch {

    public static int linearSearch(int array[], int target) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                index = i;
                break;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("enetr the array value one by one : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }


        // input target element
        System.out.println("enter the target element: ");
        int target = sc.nextInt();


        int foundIndex = linearSearch(arr, target);
        if (foundIndex == -1) {
            System.out.println("element not found");
        } else {
            System.out.println("Element found at index: " +foundIndex);
        }




        sc.close();
        


    }
}