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
        if(head==null || head.next==null) return null;
        int len=0;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
       int mid=len/2;
       int cnt=0;
       temp=head;
       while(temp!=null){
        if(cnt==mid-1){
            break;
        }
        temp=temp.next;
        cnt++;
       }
       temp.next=temp.next.next;
        return dummy.next;
    }
}