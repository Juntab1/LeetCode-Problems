// Easy question of seeing where the middle node was.
class Solution2 {
    public ListNode middleNode(ListNode head) {

        // another way of doing it:
        // ListNode slow=head;
        // ListNode fast =head;

        // while(fast!=null && fast.next!=null){
        //     slow=slow.next;
        //     fast=fast.next.next;
        // }
        // return slow;
        // FOR SURE A INTERESTING WAY OF DOING IT

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