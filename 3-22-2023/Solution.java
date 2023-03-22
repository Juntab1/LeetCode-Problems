import java.util.*;

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> preOrder = new ArrayList<>();
        helper(root, preOrder);
        return preOrder;  
    }

    private List<Integer> helper(Node root, List<Integer> preOrder){
        // base case need to return to be done with the recursion case when hit null and also 
        // returning here is useful for when you
        // have a null case.
        // Can do a if else but it makes your code slower.
        if (root == null){
            return preOrder;
        }
        preOrder.add(root.val);
        for (Node r : root.children){
            helper(r,preOrder);
        }
        return preOrder;
    }

    class Node {
        public int val;
        public List<Node> children;
    
        public Node() {}
    
        public Node(int _val) {
            val = _val;
        }
    
        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}