// I was able to solve this all bymyself too but I did not fully follow the instructions. I believe that this is 
// liner time complexity but there is a more effiecient way of solving this problem using XOR. I need to
// look more into XOR tommorow. So far proud of myself for heading on the right track and getting 2 questions
// correct in a row so far!
class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> keep = new HashMap<>();
        for (int n : nums){
            if (!keep.containsKey(n)){
                keep.put(n, 0);
            }
            keep.put(n, keep.get(n)+1);
        }
        for (int key : keep.keySet()){
            if (keep.get(key) != 2){
                return key;
            }
        }
        return 0;
    }
}
