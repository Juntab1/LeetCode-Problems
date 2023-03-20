
// This solution works. Next time draw it out more to figure it out before 
// thinking you know how to do it and blindly writing code out.
 class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode answer = new ListNode(-1);
        ListNode curr = answer;
        while (list1 != null && list2 != null){
            if (list1.val <= list2.val){
                curr.next = list1;
                list1 = list1.next;
            }
            else{
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }
        if (list1 == null){
            curr.next = list2;
        }
        else{
            curr.next = list1;
        }

        return answer.next; 
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}

// This approach did not work and I can't really figure out why.
// However, looking at solutions there is a recursive way to do this
// class Solution {
//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//          if (list1 == null) return list2;
//          if (list2 == null) return list1;
//         ListNode answer = list1;
//         if (answer.val > list2.val){
//             answer = new ListNode(list2.val, answer);
//             list2 = list2.next;
//         }
//         ListNode curr = answer;
//         while (list2 != null){
//             if (curr.val < list2.val){
//                 curr.next = new ListNode(list2.val,curr.next);
//             }
//             else{
//               curr = new ListNode(list2.val,curr);  
//             }
//             list2 = list2.next;
//             curr = curr.next.next;
//         }
//         return answer; 
//     }
// }
