// FIBONACCI SERIES 
// 0 , 1, 1,2(1+1),3(2+1),5(3+2),8(5+3)
// current sm = prev sum + prev sum
// QUESTION - FIND THE nth TERM IN THE FIBONNACI SERIES 
//SUBPROBLEM - f(n) = f(n-1) + f(n-2)
//self work - addition will be the self work
//base case - n = 0 is ans 0 and n = 1 is  1

public class Rec3 {

    static int fib(int n){
        //base case
        if (n == 0 || n == 1){
            return n;
        }
        return fib(n-1) + fib(n-2);
        // //subproblems - recursive work
        // int prev = fib(n-1);
        // int prevPrev = fib(n-2);

        // //selfwork 
        // return prev + prevPrev;
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 10 ; i++){
            System.out.println(fib(i));
        }
    }
    
}
