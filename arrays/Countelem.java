import java.util.Scanner;

public class Countelem {

    public static int countTargetElement(int arr[], int targetElement) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == targetElement)
                count++;
        }
        
        return count;

        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("enter the array value one by one : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // input target element 
        System.out.println("Enter the target element: ");
        int target = sc.nextInt();

        // logic to find target element
        int count = countTargetElement(arr, target);
        
        System.out.println("Target Element Count : " + count);

        sc.close();   

    }
    
}
