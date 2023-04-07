// my inital way of doing it but it takes more time than simply doing:
// Arrays.sort(nums);
// return nums[nums.legnth/2]
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> ans = new HashMap<>();
        for (int n : nums){
            if (!ans.containsKey(n)){
                ans.put(n, 0);
            }
            ans.put(n, ans.get(n)+1);
        }
        for (int n : ans.keySet()){
            int valN = ans.get(n);
            if (valN > (nums.length/2)){
                return n;
            }
        }
        return 0;
    }
}
