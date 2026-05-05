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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
                ListNode sortedNode = new ListNode(-1);

       ListNode heaNode = sortedNode;
        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                sortedNode.next = list2;
                
                list2 = list2.next;
            } else {
                sortedNode.next = list1;
                
                list1 = list1.next;

            } 
            sortedNode = sortedNode.next;

        }
        if (list1 == null && list2 != null) {
            sortedNode.next = list2;
        } else if (list1 != null && list2 == null) {
            sortedNode.next = list1;
        }

        return heaNode.next;
    }
}