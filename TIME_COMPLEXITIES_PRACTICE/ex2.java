// the loop is dependent on input size
// the time coplexity is O(n) linear complexity

public class ex2 {
    int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }

        return sum;

    }
    
    public static void main(String[] args) {
        ex2 obj = new ex2();

        int[] num = { 10, 20, 30, 40, 50 };

        int result = obj.sumArray(num);
        System.out.println("returned value " + result);

    }
}
