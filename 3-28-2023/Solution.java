// This solution works. It is just hard to think of the bottom up DP approach.
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        // if we try to get hold of an empty index we get 0 back as the value
      int size = triangle.size();
      int[][] dp = new int[size+1][size+1];
  
      for (int i = size - 1; 0 <= i; i--){
          for (int j = 0; j <= i; j++){
              dp[i][j] = triangle.get(i).get(j) + Math.min(dp[i+1][j], dp[i+1][j+1]);  
          }
      }
      return dp[0][0];
    }
          
  }

// Tried to do this from a top down approach but the problem was that I was not taking into consideration all the paths. 
// One way could start out being the smallest but then with the restrition of how we can only see the i and i + 1
// variables we would miss out on all the other variables and all the other variables might have added up to a smaller
// number.
// class Solution {
//     public int minimumTotal(List<List<Integer>> triangle) {
//         int[] dp = new int[triangle.size()];
//         int ans = 0;
//         int index = 0;
//         int addCurr = 0;
//         int minBranch = 100000;
//         for (List<Integer> currBranch : triangle){
//             if (currBranch.size() == 1){
//                 minBranch = currBranch.get(0);
//             }
//             else{
//                 int startIndex = index;
//                 for (int i = startIndex+1; i >= startIndex; i--){
//                     if (currBranch.get(i) < minBranch){
//                         minBranch = currBranch.get(i);
//                         index = i;
//                     }
//                 }
//             }
//             dp[addCurr] = minBranch;
//             addCurr++;
//             minBranch = 100000;
//         }
//         for (int i = 0; i < dp.length; i++){
//             ans += dp[i];
//         }
//         return ans;
//     }
// }
