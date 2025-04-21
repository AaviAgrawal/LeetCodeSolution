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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        int n = 1;
        ListNode temp = head;
        while(temp.next != null){
            n++;
            temp = temp.next;
        }
        temp.next = head;
        ListNode a = head;
        k = k%n;
        for(int i=1;i<n-k;i++){
            a = a.next;
        }
        ListNode curr = a.next;
        a.next = null;
        return curr;
    }
}