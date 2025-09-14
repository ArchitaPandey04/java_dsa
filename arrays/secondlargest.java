import java.util.Scanner;

public class secondlargest {

    public static int findSecondLargestNumber(int arr[]) {

        // assume
        int largest = arr[0];
        int secondlargest = arr[1];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondlargest && arr[i] != largest) {
                secondlargest = arr[i];
            }

            
        }
        return secondlargest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the elements of array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }


        // fid the second largest number
        int secondlargest = findSecondLargestNumber(arr);
        System.out.println("Second largest number: " + secondlargest);

        sc.close();


    }
    
}
