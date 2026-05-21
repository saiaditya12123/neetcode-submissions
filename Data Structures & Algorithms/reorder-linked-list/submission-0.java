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
    public void reorderList(ListNode head) {
         if(head!=null && head.next!=null && head.next.next!=null){
         ListNode fast=head.next;
         ListNode slow=head;
         while (fast!=null && fast.next!=null){
             fast=fast.next.next;
             slow=slow.next;
         }
         ListNode second=reverseLinkedList(slow.next);
         slow.next=null;
         ListNode first=head;
         while (second!=null){
             ListNode firstNext=first.next;
             ListNode secNext=second.next;
             first.next=second;
             second.next=firstNext;
             first=firstNext;
             second=secNext;

         }
     }
    }
      public ListNode reverseLinkedList(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while (curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
