import java.util.Scanner;

public class sumofelements {

    public static int SumArray(int[] arr)
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("enter the array value one by one");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();

        }
        int sum = SumArray(arr);
        System.out.println("Array Sum = " + sum);

        sc.close();
    }

    
}
