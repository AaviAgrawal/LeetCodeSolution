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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode mid = returnMid(head);
        ListNode high = mid.next;
        mid.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(high);
        return merge(left, right);
    }

    public ListNode returnMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode merge(ListNode lft, ListNode rgt) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while (lft != null && rgt != null) {
            if (lft.val < rgt.val) {
                curr.next = lft;
                lft = lft.next;
            } else {
                curr.next = rgt;
                rgt = rgt.next;
            }
            curr = curr.next;
        }
        if (lft != null)
            curr.next = lft;
        if (rgt != null)
            curr.next = rgt;
        return dummy.next;
    }
}