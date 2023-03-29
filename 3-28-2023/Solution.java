
// Tried to do this from a top down approach but the problem was that I was not taking into consideration all the paths. 
// One way could start out being the smallest but then with the restrition of how we can only see the i and i + 1
// variables we would miss out on all the other variables and all the other variables might have added up to a smaller
// number.
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] dp = new int[triangle.size()];
        int ans = 0;
        int index = 0;
        int addCurr = 0;
        int minBranch = 100000;
        for (List<Integer> currBranch : triangle){
            if (currBranch.size() == 1){
                minBranch = currBranch.get(0);
            }
            else{
                int startIndex = index;
                for (int i = startIndex+1; i >= startIndex; i--){
                    if (currBranch.get(i) < minBranch){
                        minBranch = currBranch.get(i);
                        index = i;
                    }
                }
            }
            dp[addCurr] = minBranch;
            addCurr++;
            minBranch = 100000;
        }
        for (int i = 0; i < dp.length; i++){
            ans += dp[i];
        }
        return ans;
    }
}
