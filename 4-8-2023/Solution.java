// having a problem with my for loop to find if the jump actually works
class Solution {
    public boolean canJump(int[] nums) {
        int maxLen = nums.length;
        boolean[] ans = new boolean[maxLen];
        for (int i = 0; i < maxLen; i++){
            ans[i] = false;
        }
        ans[maxLen-1] = true;
        for (int j = maxLen-2; 0 <= j; j--){
            if ((j+1) <= (j+nums[j])){
                ans[j] = true;
            }
        }
        return ans[0];
    }
}