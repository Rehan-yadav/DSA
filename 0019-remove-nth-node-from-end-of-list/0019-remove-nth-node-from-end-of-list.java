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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode temp=head;
        if(head==null) return head;
       
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        int k=count-n+1;
        temp=head;
        ListNode prev=null;
        int cnt=0;
        if(k==1) return head.next;
        while(temp!=null){
            cnt++;
            if(cnt==k){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }
}