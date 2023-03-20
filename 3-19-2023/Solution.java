// This is a linked List problem that can be done iterativly or recursivly. I tried to do
// recursive but it was harder than I thought. I need to practice a little more on my recursion.
// However, I understood the iteration way.
// The idea is that you need to keep a temp variable that stores everything else than the first 
// variable in your curr and your PREV variable keeps track of your reverse order of nodes
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode reverse = null;

        while (curr != null){
            ListNode temp = curr.next;
            curr.next = reverse;
            reverse = curr;
            curr = temp;
        }
        return reverse;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
