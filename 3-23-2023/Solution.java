// This is O(n) but I need to make it O(log(N)).
// That is what the question was asking.
// 1. look up what makes a code log(N)
class Solution {
    public int search(int[] nums, int target) {
        int index = -1;
        for (int i = 0; i < nums.length; i++){
            index++;
            if (nums[i] == target){
                return index;
            }
        }
        return -1;
    }
}
