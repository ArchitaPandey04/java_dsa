//GIVEN TWO NUMBERS P & Q, FIND THE VALUE P^q using a recursive function simple the power of p which is q
// p ^ q-1 *  p
// f(p,q) = f(p,q-1) * p --recurrance relation
// base case = q^0 = 1
// f(p,q) = {f(p,q-1) * p, q>0} {1,q=0}

public class rec5 {
    static int pow(int p,int q){
        //base case
        if(q==0){
            return 1;
        }

        //recursive work
        int smallAns = pow(p, q-1);

        return smallAns * p;
    }


    public static void main(String[] args) {
        System.out.println(pow(4,3));
        
    }
    
}
