
// Initialize int[] answer as a object with passed in nums.
// 2nd add up all the values within the left and right boundaries as a method. 
class NumArray {
    private int[] answer;
    public NumArray(int[] nums) {
        this.answer = nums;
    }
    
    public int sumRange(int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; i++){
            sum += answer[i];
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
