// recursive way is so easy. I should have seen this coming.
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val > p.val && root.val > q.val){
            return lowestCommonAncestor(root.left, p, q);
        }
        else if (root.val < p.val && root.val < q.val){
            return lowestCommonAncestor(root.right, p, q);
        }
        // base case of when we found the LCA
        return root;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}

// First attempt at the problem. It sort of worked but the part it did not work was when one side of the root was null or just empty.
// However, it was a good first attempt. It is easier to do recursion though.
// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode(int x) { val = x; }
//  * }
//  */

//  class Solution {
//     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//         Queue<TreeNode> que = new LinkedList<>();
//         que.add(root);
//         while (!que.isEmpty()){
//             TreeNode removed = que.remove();
//             if ((removed.left == p || removed.right == p) && (removed.left == q || removed.right == q)){
//                 return removed;
//             }
//             else if ((removed == p || removed == q) && ((removed.left == p || removed.right == p) || (removed.left == q || removed.right == q))){
//                 return removed;
//             }
//             else{
//                 que.add(removed.left);
//                 que.add(removed.right);
//             }
//         }
//         return null;
//     }
// }
