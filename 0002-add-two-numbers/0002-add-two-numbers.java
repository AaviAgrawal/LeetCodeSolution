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
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;
        while(l1!=null || l2!=null || carry!=0){
            int d1 = l1 != null ? l1.val : 0;
            int d2 = l2 != null ? l2.val : 0;

            int sum = (d1+d2+carry)%10;
            carry = (d1+d2+carry)/10;

            ListNode newNode = new ListNode(sum);
            curr.next = newNode;
            curr = curr.next;

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        ListNode r = dummy.next;
        dummy.next = null;
        return r;
    }
}