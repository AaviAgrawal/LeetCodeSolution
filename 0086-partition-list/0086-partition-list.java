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
    public ListNode partition(ListNode head, int x) {
        ListNode leastHead = new ListNode(0,null);
        ListNode highHead = new ListNode(0,null);
        ListNode least = leastHead;
        ListNode high = highHead;
        ListNode temp = head;
        while(temp != null){
            if(temp.val < x){
                least.next = temp;
                least = least.next;
            }
            else{
                high.next = temp;
                high = high.next;
            }
            temp = temp.next;
        }
        high.next = null;
        least.next = highHead.next;
        return leastHead.next;
    }
}