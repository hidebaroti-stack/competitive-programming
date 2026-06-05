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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);             //dummy head
        ListNode current = dummy;                     //pointer to build result
        int carry = 0;                                //carry for digit addition

        //Transverse both lists until both are null and carry is 0
        while(l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0;        // digit from l1
            int y = (l2 != null) ? l2.val : 0;        // digit from l2

            int sum = x + y + carry;                  //add digits + carry
            carry = sum / 10;                         //update carry
            current.next = new ListNode(sum % 10);    //new node with remainder
            current = current.next;                   //move pointer forward

            if(l1 != null) l1 = l1.next;              //advance l1
            if(l2 != null) l2 = l2.next;              //advance l2
        }
        return dummy.next;                            //return head of result list
    }
}