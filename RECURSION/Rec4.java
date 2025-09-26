//  GIVEN AN INTEGER , FIND OUT THE SUM OF ITS DIGIGT USING RECURSION
//  input 5,4,3 - output should be 5+4+3 = 12
// SUBPROBLEM - 
// if we do n % 10 - last digit of n
// if we do n/10 - we get (n-1)
// f(n)[sum of digits of n] = f(n/10) sum of all n-1 digit +n % 10 [ots the last digit]
//BASE CASE - n>= 0 and n<9
//TIME COMPLEXITY = NO. OF RECURSIVE CALLS * TIME TAKEM IN    CALL


public class Rec4 {

    static int sumOfDigits(int n){
        // base case
        if(n >= 0 && n <= 9){
            return n;
        }

        return sumOfDigits(n/10) + n%10;

        // //recursive work --> small work
        // int smallAns = sumOfDigits(n/10);

        // //self work
        // return smallAns + n%10;

        
    }


    public static void main(String[] args) {
        System.out.println(sumOfDigits(1234));
        
    }
    
}
