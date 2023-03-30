// This is the 1st question of the 100 most liked questions on leetcode
// This was good but it is O(n^2) complexity which is not really good.

class solution3 {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if ((nums[i] + nums[j]) == target){
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        return answer;
    }
}
