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
    public ListNode reverseList(ListNode head) {

        //Empty list/Single list already reversed
        if(head == null || head.next == null) return head;

        //Recurse until the end of the list, newHead will the last node
        ListNode newHead = reverseList(head.next);

        head.next.next = head; //Flip poniter: next node points back to the current
        head.next = null;      //Current node becomes new tail
        return newHead;        //Return new head of reversed list
    }
}