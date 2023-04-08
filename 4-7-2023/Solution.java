// I tried to solve this with a set because a set can't have an array with duplicates
// but I might have to use a two poitner approach that has 
// a for loop that goes through the nums and everytime we encounter a new variable
// we make that new variable equal to whatever the index is at and move the pointer to that
// new variable but also increase the index.

// I did it this way to save on space and it worked better but I can't figure out some of the cases like the starting cases of the nums int array
// so I decided to add if statements and such but still can't figure out some errors!
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 2){
            if (nums[0] != nums[1]){
                return 2;
            }
        }
        if (nums.length == 3){
            return 2;
            
        }
        int index = 1;
        for (int i = 1; i < nums.length - 1; i++){
            if (nums[i] != nums[i+1]){
                nums[index] = nums[i+1];
                index++;
            }
        }
        return index;
        // Set<Integer> ans = new HashSet<>();
        // for (int n : nums){
        //     ans.add(n);
        // }
        // int unique = ans.size();
        // for (int i = 0; i < nums.length; i++){
        //     if (i > unique){
        //         nums[i] = 0;
        //     }
        //     else{
        //         nums[i] = ans.remove();
        //     }
        // }
        // return unique;
    }
}