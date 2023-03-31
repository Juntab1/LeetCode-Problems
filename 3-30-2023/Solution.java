// I was able to solve the solution finally. It was not even really a hard question.
// The only trouble I had was understanding what the question was actually asking. I thought it 
// was asking me how I am going to get the listnode added up and in reverse order. However,
// it just wanted to ask you how to add it together correctly.
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0;
        int carryOver = 0;
        // creates a list node with a 0 at the front
        ListNode ans = new ListNode();
        ListNode temp = ans;
        while(l1 != null || l2 != null || carryOver != 0){
            sum += carryOver;
            if (l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            carryOver = sum/10;
            temp.next = new ListNode(sum % 10);
            temp = temp.next;
            sum = 0;
        }
        return ans.next;
    }
}



// I was able to pass 2 of the 3 test cases with this solution but not all the cases.
// class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         Map<Integer,Integer> putNum = new HashMap<>();
//         int place = 0;
//         while (l1 != null){
//             int addNum = l1.val;
//             if (!putNum.containsKey(place)){
//                 putNum.put(place,0);
//             }
//             putNum.put(place, putNum.get(place)+addNum);
//             place++;
//             l1 = l1.next;
//         }
//         place = 0;
//         while (l2 != null){
//             int addNum = l2.val;
//             if (!putNum.containsKey(place)){
//                 putNum.put(place,0);
//             }
//             putNum.put(place, putNum.get(place)+addNum);
//             if (putNum.get(place) >= 10){
//                 if (!putNum.containsKey(place-1)){
//                     putNum.put(place-1,0);
//                 }
//                 putNum.put(place-1, putNum.get(place-1)+1);
//                 putNum.put(place, putNum.get(place)%10);
//             }
//             place++;
//             l2 = l2.next;
//         }
//         ListNode ans = new ListNode();
//         for (int curr: putNum.keySet()){
//             if (curr == 0){
//                 ans = new ListNode(putNum.get(curr));
//             }
//             else{
//                 int numGot = putNum.get(curr);
//                 ans = new ListNode(numGot, ans);  
//             }
//         }
//         return ans;
//     }
// }

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

 // attempted this way but it does not work or I just can't figure it out.
 // tried doing it by storing the data as an int. However, I want to 
 // try it using an map.
// class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         int totalVal = 0;
//         int multiplier = 1;
//         int greatest = 1;
//         while (l1 != null){
//             totalVal += l1.val * multiplier;
//             multiplier = multiplier * 10;
//             l1 = l1.next;
//         }
//         if (multiplier > greatest){
//             greatest = multiplier;
//         }
//         multiplier = 1;
//         while (l2 != null){
//             totalVal += l2.val * (multiplier * 10);
//             l2 = l2.next;
//         }
//         if (multiplier > greatest){
//             greatest = multiplier;
//         }
//         ListNode ans = new ListNode((totalVal/greatest));
//         greatest = greatest/10;
//         ListNode temp = ans;
//         while (greatest != 0){
//             temp.next = new ListNode((totalVal/greatest));
//             greatest = greatest/10;
//             temp = temp.next;
//         }
//         return ans;
//     }
// }
