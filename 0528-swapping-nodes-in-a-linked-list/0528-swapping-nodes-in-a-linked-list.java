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
    public ListNode swapNodes(ListNode head, int k) {
        int length = 0;
        ListNode temp = head;
        while(temp != null){
            length++;
            temp = temp.next;
        }
        ListNode f = head;
        for(int i=0;i<k-1;i++){
            f = f.next;
        }
        ListNode s = head;
        for(int i=0;i<length-k;i++){
            s = s.next;
        }
        int temps = f.val;
        f.val = s.val;
        s.val = temps;
        return head;
    }
}