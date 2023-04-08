// I tried to solve this with a set because a set can't have an array with duplicates
// but I might have to use a two poitner approach that has 
// a for loop that goes through the nums and everytime we encounter a new variable
// we make that new variable equal to whatever the index is at and move the pointer to that
// new variable but also increase the index.
class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> ans = new HashSet<>();
        for (int n : nums){
            ans.add(n);
        }
        int unique = ans.size();
        for (int i = 0; i < nums.length; i++){
            if (i > unique){
                nums[i] = 0;
            }
            else{
                nums[i] = ans.remove();
            }
        }
        return unique;
    }
}