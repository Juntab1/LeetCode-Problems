/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
// I was very close to the correct answer! I just need to think of it more simple. THe one thing I forgot was that
// for my while loop if I check that counter and counter.next is not null it will mean that there has to be some kind 
// of val or null for the .next.next so that is why it works
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode counter = head;
        while (counter != null && counter.next != null){
            if (counter.val == counter.next.val){
                // you can do counter.next.next because if we enter while loop it means that if nothing is there there will technically be a null val there
                counter.next = counter.next.next;
            }
            else{
                counter = counter.next;
            }
        }
        return head;
    }
}

 // This code does not pass all the tests and I do not currently know how to fix it
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode counter = head.next;
        int valueRn = head.val;
        while (counter.next != null){
            if (counter.val == valueRn){
                head = counter;
            }
            valueRn = counter.val;
            counter = counter.next;
        }
        if (counter.val == valueRn){
            counter = null;
        }
        return head;
    }
}