// Easy question of seeing where the middle node was.
class Solution2 {
    public ListNode middleNode(ListNode head) {
        if (head == null){
            return null;
        }
        int count = 0;
        ListNode countCurr = head;
        while (countCurr != null){
            count++;
            countCurr = countCurr.next;
        }
        count = count/2;
        while (count > 0){
            head = head.next;
            count--; 
        }
        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}