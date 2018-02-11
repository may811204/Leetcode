/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    // O(n), O(n)
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        int sum = 0;
        ListNode current = dummy;
        ListNode p1 = l1, p2 = l2;
        while (p1 != null || p2 != null){
            if (p1 != null) {
                sum += p1.val;
                p1 = p1.next;
            }
            if (p2 != null){
                sum += p2.val;
                p2 = p2.next;
            }
            current.next = new ListNode(sum % 10);
            sum /= 10;
            current = current.next;
        }
        //Careful: need to do extra check for [5] + [5] = [0, 1] 
        if (sum == 1) current.next = new ListNode(1);
        return dummy.next;
    }
}