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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right || head == null) return head;
        ListNode leftNode = head;
        ListNode prevL = null;
        for(int i=1;i<left;i++){
            prevL = leftNode;
            leftNode = leftNode.next;
        }
        ListNode leftL = leftNode;
        ListNode prev = null;
        for(int i=left;i<=right;i++){
            ListNode nextL = leftNode.next;
            leftNode.next = prev;
            prev = leftNode;
            leftNode = nextL;
        }
        if(prevL != null) prevL.next = prev;
        else head = prev;
        leftL.next = leftNode;
        return head;
    }
}