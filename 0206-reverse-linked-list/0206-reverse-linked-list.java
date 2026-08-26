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
    public ListNode reverseList(ListNode head){
        ArrayList<Integer> arr =new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            arr.add(temp.val);
            temp=temp.next;
        }
        temp=head;
        int ind=arr.size()-1;
        while(temp!=null){
            temp.val=arr.get(ind);
            ind--;
            temp=temp.next;
        }
        return head;
    }
}