import java.util.*;

// This was a medium level question. It was sort of difficult.
// However, I understood it after a while.
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> finalAns = new ArrayList<>();
        if (root == null){
            return finalAns;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            List<Integer> currAns = new ArrayList<>();
            int size = q.size();
            for (int i = 0; i < size; i++){
                TreeNode curr = q.remove();
                if (curr.left != null){
                    q.add(curr.left);
                }
                if (curr.right != null){
                    q.add(curr.right);
                }
                currAns.add(curr.val);
            }
            finalAns.add(currAns);
        }
        return finalAns;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    
}
