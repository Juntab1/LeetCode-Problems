// Looking at someone's approach to the problem I understand how to do it now
// First, I need to create an set to store the triplet also create the double list
// Second, I need to sort the array with probably just .sort but I need to check if I can just do that
// create a for loop for i 
//  within the for looop create 2 pointers j and k
//  do a while loop for as long as j < k 
//   if the answer is less than 0 increase j
//   if the answer is greater than 0 decrease k
//  after that for loop runs go threw the set and split is up into the triplets with a
//  for loop most likely
//  LAST return it!
// Then you are done!!!!!


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