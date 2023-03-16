
// Iterative way worked. Main idea is 
// get the value of the whole list together then
// start subtracting each value from the front not inluding the 
// value you are currently on from the temp value you are 
// putting the sum against.
class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        for (int j = 0; j < nums.length; j++){
            sum -= nums[j];
            if (sum == temp){
                return j;
            }
            else{
                temp += nums[j];
            }
        }
        return -1;
    }
}




// This way did not pass all the tests I could not figure out why.
// class Solution {
//     public int pivotIndex(int[] nums) {
//         return pivotIndexHelper(nums, 0, 0);
//     }

//     private int pivotIndexHelper(int[] nums, int totalCurr, int index){
//         if (index >= nums.length){
//             return -1;
//         }
//         int totalAfter = 0;
//         if(index > 0){
//             totalCurr += nums[index - 1];
//         }
//         for (int i = index + 1; i < nums.length; i++){
//             totalAfter += nums[i];
//         }
//         if (totalCurr == totalAfter){
//             return index;
//         }
//         pivotIndexHelper(nums, totalCurr, ++index);
//         return -1;
//     }
// }
