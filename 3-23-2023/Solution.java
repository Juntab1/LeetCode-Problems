class Solution {
    // correct solution for O(logN)
    public int search(int[] nums, int target) {
        int bottom = 0;
        int top = nums.length;
        while (bottom <= top){
            // have to have the bottom + at the front because you are saying that if the top - bottom is 0 just say that mid is bottom.
            int mid = bottom + (top - bottom)/2;
            if (nums[mid] == target){
                return mid;
            }
            if (target > nums[mid]){
                // get rid of everything that is less than middle
                bottom = mid + 1;
            }
            else{
                // get rid of everything that is greater than middle
                top = mid - 1;
            }
        }
        return -1;
    }
}


// This is O(n) but I need to make it O(log(N)).
// That is what the question was asking.
// class Solution {
//     public int search(int[] nums, int target) {
//         int index = -1;
//         for (int i = 0; i < nums.length; i++){
//             index++;
//             if (nums[i] == target){
//                 return index;
//             }
//         }
//         return -1;
//     }
// }
