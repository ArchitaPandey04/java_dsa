public class Pattern1 {
    public static void main(String[] args) {
        pattern1(5);
        
    }

    static void pattern1(int n){
        // step1-look how many lines at the problems that no. of times outer loop will run
        for(int row = 1; row <= n;row++){
            // step 2- how many columns are there with each row or types of elemnets in the column
        // for every run the col
            for (int col = 1; col <= row; col++){
                // what do you need to print
                System.out.print("* ");
            }

            // when one row is printed,we need to add a new line
            System.out.println();
        


        }

    }
}