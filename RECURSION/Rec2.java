// FIND THE VALUE OF FACTORIAL 5
// 5! = 1*2*3*4*5
// f(n) = n * f(n-1) --recurrance relation
// subproblems - f(n-1)
// selfwork - n
//basecase - if(n==0) its factorila will be 0

public class Rec2 {

    static int factorial(int n){
        //base case
        if(n == 0) {
            return 1;
        }

        //smaller problem - recusive relation
        int smallAns = factorial(n-1);  //calling factorial(4) = 24

        //self work
        int ans = n * smallAns; //n* factorial(n-1)
        return ans;


        

    }
    public static void main(String[] args) {
        System.out.println(factorial(10));
        
    }
    
}
