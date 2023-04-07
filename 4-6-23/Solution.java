class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                nums[index] = nums[i];
                index++;
            }
        }
        for (int i = index; i < nums.length; i++){
            nums[i] = 0;
        }
    }
}

// type of format and structure I had for this problem at the start but it excedded time.
// this is O(n^2) so that is most likely why.
// for (int i = 0; i < nums.length; i++){
//     if (nums[i] == 0){
//         for (int j = i; j < nums.length-1; i++){
//             if ()
//             nums[j] =
//         }
//         nums[nums.length-1] = 0;
//     }
// }
