public class main {
    public main(String[] args) {
        int[] nums = { 23, 45, 67, 89, 9, 86, 45, 32 };
        int target = 9;
        int ans = linearSearch(nums, target);
        System.out.println(ans);

    }
    
    
    // search in the array : return the indexif itemfound
    // otherwise if item not found -1

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run for a loop
        for (int i = 0; i < arr.length; i++) {
            // check for element at everu index if it is = target
            int element = arr[i];
            if (element == target) {
                return i;
            }

        }
    
        // this line execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }
}
