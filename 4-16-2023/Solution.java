// I am still having struggle understanding what some of these questions are asking me at times.
class Solution {
    public int removeElement(int[] nums, int val) {
        int currNum = 0;
        for (int num : nums){
            if (num != val){
                nums[currNum] = num;
                currNum++;
            }
        }
        return currNum;
    }
}


// Not space efficient and does not work for some reason
// class Solution {
//     public int removeElement(int[] nums, int val) {
//         int[] ans = new int[nums.length];
//         int numLeft = 0;
//         int j = 0;
//         for (int i = 0; i < nums.length; i++){
//             if (nums[i] != val){
//                 numLeft++;
//                 ans[j] = nums[i];
//                 j++;
//             }
//         }
//         nums = ans;
//         return numLeft;
//     }
// }
