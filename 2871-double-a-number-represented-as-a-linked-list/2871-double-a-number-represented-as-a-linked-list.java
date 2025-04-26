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
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        while(head != null){
            ListNode n = head.next;
            head.next = prev;
            prev = head;
            head = n;
        }
        return prev;
    }
    public ListNode doubleIt(ListNode head) {
        int carry = 0;
        head = reverse(head);
        ListNode result = null;
        while(head != null || carry != 0){
            int mul = carry;
            if(head != null){
                mul = 2*head.val + carry;
                head = head.next;
            }
            ListNode node = new ListNode(mul%10);
            carry = mul/10;
            node.next = result;
            result = node;
        }
        return result;
    }
}