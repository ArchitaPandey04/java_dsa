// https://leetcode.com/problems/richest-customer-wealth/description/

public class maxwealth {
    public static void main(String[] args) {
        
    }

    public int maxwealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        // person =row, account = col
        for (int[] ints : accounts){
            // when you start a new col, take a sum for that row
            int sum = 0;
            for( int anInt : ints){
                sum += anInt;
            }

            // now we have sum of accounts of person
            // check with overall ans
            if (sum > ans){
                ans = sum;
            }
        }
        return ans;
    }



    
}
