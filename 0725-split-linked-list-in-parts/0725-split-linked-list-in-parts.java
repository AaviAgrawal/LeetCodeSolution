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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] part = new ListNode[k];
        int n = 0;
        ListNode curr = head;
        while(curr != null){
            n++;
            curr = curr.next;
        }
        int baseSize = n/k;
        int extra = n%k;
        ListNode temp = head;
        for(int i=0;i<k;i++){
            ListNode partHead = temp;
            int currSize = baseSize + (extra > 0 ? 1 : 0);
            extra--;
            for(int j=0;j<currSize-1;j++){
                if(temp != null) temp = temp.next;
            }
            if(temp != null){
                ListNode nextPart = temp.next;
                temp.next = null;
                temp = nextPart;
            }
            part[i] =partHead;
        }
        return part;
    }
}