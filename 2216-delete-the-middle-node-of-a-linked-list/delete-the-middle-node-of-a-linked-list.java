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
    public ListNode deleteMiddle(ListNode head) {
        int count = 0;
        ListNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        
        if (count == 1) {
            return null;
        }

        int middle = count / 2;

        temp = head;

       
        while (middle > 1) {
            temp = temp.next;
            middle--;
        }

        temp.next = temp.next.next;

        return head;
    }
}