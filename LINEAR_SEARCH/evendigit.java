//leetcode 1295. Find Numbers with Even Number of Digits
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/?envType=problem-list-v2&envId=array

public class evendigit {
    public static void main(String[] args) {
        int[] num = {12,345,2,6,7896};
        System.out.println(findNumbers(num));
        
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums) {
            if (even(num)){
                count++;
            }
        }
        return count;
    }
// function to check whether a number contains even digits or not
    static boolean even(int num) {
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;



        }

        //  count number of digits in a number
        static int digits(int num){
            int count = 0;

            while(num > 0){
                count++;
                num = num/10;
            }
            return count;
        }
    }

    

