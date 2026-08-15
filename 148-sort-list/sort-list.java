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
    public ListNode middle(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode merge(ListNode left,ListNode right){
        ListNode i=left,j=right;
        ListNode temp,head;
        if(i.val<j.val){
            temp=i;
            head=i;
            i=i.next;
        }
        else{ 
            temp=j;
            head=j;
            j=j.next;
        }
        while(i!=null && j!=null){
            if(i.val<j.val){
                temp.next=i;
                i=i.next;
            }
            else{
                temp.next=j;
                j=j.next;
            }
            temp=temp.next;
        }
        while(j!=null){
            temp.next=j;
            j=j.next;
            temp=temp.next;
        }
        if(i!=null) {
            temp.next=i;
            i=i.next;
            temp=temp.next;
        }
        return head;
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode mid=middle(head);
        ListNode left=head,right=mid.next;
        mid.next=null;
        ListNode lefthead=sortList(head);
        ListNode righthead=sortList(right);
       return merge(lefthead, righthead);
    }
    
}