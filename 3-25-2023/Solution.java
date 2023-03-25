// Solution that works but I don't understand why you use long instead of int
class Solution {
    public boolean isValidBST(TreeNode root) {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean helper(TreeNode root, long min, long max){
      if (root == null){
        return true;
      }
      if (root.val <= min || root.val >= max){
        return false;
      }
      return helper(root.left, min, root.val) && helper(root.right, root.val, max);

    }
}

// This solution did not work becuase for example when you are on the right side of the tree
// and you get a value less than the original root my tests don't work for that
// class Solution {
//     public boolean isValidBST(TreeNode root) {
//         if (root == null){
//             return false;
//         }
//         Queue<TreeNode> ans = new LinkedList<>();
//         int originalValue = root.val;
//         ans.add(root;
//         while(!ans.isEmpty()){
//             int size = ans.size();
//             for (int i = 0; i < size; i++){
//                 TreeNode tN = ans.remove();
//                 if (tN.left != null){
//                     if (tN.left.val < tN.val && tN.left.val > originalValue){
//                     ans.add(tN.left);
//                     }
//                     else{
//                         return false;
//                     }
//                 }
//                 if (tN.right != null){
//                     if (tN.right.val > tN.val && tN.right.val < originalValue){
//                     ans.add(tN.right);
//                     }
//                     else{
//                         return false;
//                     }
//                 }
//             }
//         }
//         return true;
//     }
// }

    


