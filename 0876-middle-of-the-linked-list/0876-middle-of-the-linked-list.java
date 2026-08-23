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
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;

        }
        int mid;
        if(count%2==0){
            mid=(count/2)+1;
        }
        else{
            mid=(count+1)/2;
        }
        temp=head;
        int cnt=0;
        while(temp!=null){
            cnt++;
            if(cnt==mid){
                head=temp;
                break;
            }
            temp=temp.next;

        }
        return head;
    }
}