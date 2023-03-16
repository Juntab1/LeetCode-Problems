// Instructions: Given a list of integers do a running sum.
// Ex: Start - nums = [1,2,3,4] End - [1,3,6,10]

// Steps:
// 1. Create public-private pair
// 2. Think about the base and the recursive case
// 3. Hit the base case when you are at the end of the list
// 4. Recurse until you are at the base case
// 5. The outer return statement is for when the total length is 0
// (one thing you can do to improve this is just add a if statement in the public  
// to make it so you don't recurse in the situation of when there is only one or no 
// int in list.
class Solution {
    public int[] runningSum(int[] nums) {
        return runningSumHelper(nums, 0, new int[nums.length], 0, nums.length);
    }
    
    private int[] runningSumHelper(int[] nums, int total, int[] now, int index, int totalLength){
        if (index == totalLength){
            return now;
        }
        else{
            int remove = nums[index];
            total += remove;
            now[index] = total;
            runningSumHelper(nums, total, now, index + 1, totalLength);
        }
        return now;
    }
}