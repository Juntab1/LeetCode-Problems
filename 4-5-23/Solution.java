// ListNode problem that checked if I knew how to do in-order
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        return helper(root, new ArrayList<Integer>());
    }

    public List<Integer> helper(TreeNode root, List answer){
        if (root != null){
            helper(root.left, answer);
            answer.add(root.val);
            helper(root.right, answer);
        }
        return answer;
    }
}
