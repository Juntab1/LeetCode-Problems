// I can't figure out how to actually do this yet but it is the idea I have right now
// However, it is not the most efficient because I have two for loops within one.
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Map<Integer,List<Integer>> ans = new HashMap<>();
        int index = 0;
        for (int n : nums){
            if (!ans.containsKey(n)){
                ans.put(n, new ArrayList<>());
            }
            ans.put(n, ans.get(n).add(index));
            index++;
        }

        for (int x : ans.keySet()){
            for (int y : ans.keySet()){
                for (int z: ans.keySet()){
                    // go through by adding checks of making sure that x y or z index's don't equal each other
                    // if it works add it to the list within a list that you are going to return
                }
            }
        }
    }
}