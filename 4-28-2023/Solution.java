/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
// This is a simpler version due to just combining the three else statements into two
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null){
            return true;
        }
        if ((p == null || q == null) || p.val != q.val){
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}

 // I tried to do the base case in one if statement but that did not work well but if I split it up it works.
// class Solution {
//     public boolean isSameTree(TreeNode p, TreeNode q) {
//         if (p == null && q == null){
//             return true;
//         }
//         else if (p == null || q == null){
//             return false;
//         }
//         else if (p.val != q.val){
//             return false;
//         }
//         return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
//     }
// }
