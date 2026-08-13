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
    public ListNode middleNode(ListNode head) {
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count+=1;
            temp=temp.next;
        }
        if(count%2==0) count=(count+2)/2;
        else count=(count+1)/2;
        temp=head;
        int i=0;
        while(i<count-1){
            temp=temp.next;
            i++;
        }
        head=temp;
        return head;
        
    }
}