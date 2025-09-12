// the time complexity is O(n)
// as first loop rund O(n) + O(100)

public class ex3 {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.println("iner loop iterartion: " + j);
            }
            System.out.println("outer loop iteration: "+i);
        }
            ;
        

    }
    
}
