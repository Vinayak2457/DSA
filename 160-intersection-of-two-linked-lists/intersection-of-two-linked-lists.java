/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA;
        ListNode p2 = headB;

        while (p1 != p2) {
            p1 = (p1 == null) ? headB : p1.next;
            p2 = (p2 == null) ? headA : p2.next;
        }

        return p1;
    }
}
// public class Solution {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         ListNode temp=headA;
//         while(temp!=null){
//             ListNode temp1=headB;
//             while(temp1!=null){
//                 if(temp1==temp){
//                     return temp;
//                 }
//                 temp1=temp1.next;
//             }
//             temp=temp.next;
//         }
//         return null;
//     }
// }