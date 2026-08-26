/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode temp=head;
        Set<ListNode> set=new HashSet<>();
        ListNode pos=head;
        int value=0;
        while(temp!=null){
            
            if(set.contains(temp)){
               return temp;
            }
            set.add(temp);
            temp=temp.next;
        }
        // temp=head;
        // while(temp!=null){
        //     if(temp.val==value) return pos;
        //     pos=pos.next;
        //     temp=temp.next;
        // }
        return null;
    }
}