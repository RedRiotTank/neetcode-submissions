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
        ListNode p1 = list1;
        ListNode p2 = list2;
        ListNode head;
        ListNode prev;
        
        if (p1 == null) return p2;
        if(p2 == null) return p1;

        if (p1.val <= p2.val) {
            prev = p1;
            p1 = p1.next;
        } else {
            prev = p2;
            p2 = p2.next;
        }

        head = prev;

        while (p1 != null || p2 != null){
            if (p1 == null) {
                prev.next = p2;
                return head;
            } else if (p2 == null){
                prev.next = p1;
                return head;
            }
            
            if (p1.val <= p2.val) {
                prev.next = p1;
                prev = p1;
                p1 = p1.next;
            } else {
                prev.next = p2;
                prev = p2;
                p2 = p2.next;
            }
        }

        return prev;
    }
}