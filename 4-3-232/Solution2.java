// almost complete just have to work out a few bugs.
class Solution2{
    public int searchInsert(int[] nums, int target) {
        int leftBound = 0;
        int rightBound = nums.length-1;
        while (rightBound >= leftBound){
            int mid = (rightBound-leftBound)/2;
            if (nums[mid] == target){
                return mid;
            }
            if (target >= nums[mid]){
                leftBound = mid;
            }
            else if (target < nums[mid]){
                rightBound = mid-1;
            }
        }
        return leftBound;
    }
}