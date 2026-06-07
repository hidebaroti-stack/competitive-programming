//Reverse Linked List (#206) --Iterative Way

/* Problem:Given the head of a singly linked list, reverse the list, and return the reversed list.
  Input: head = [1,2,3,4,5]
  Output: [5,4,3,2,1] */

/* Iterative Way: (1) Use a loop and three pointers (previous, current, nextNode).
                  (2) At each step, flip the current node’s next pointer to point to the previous node.
                  (3) Continue until current becomes null. Finally, 'previous' will be the new head. */

//Time Complexity = O(n) | Space Complexity = O(1)

import java.util.Scanner;

public class ReverseLinkedList {

    //Singly-linked list node
    static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }

    //Method: reverse the linked list using the pointers
    public static ListNode reverseList(ListNode head) {
        ListNode previous = null;   // previous starts as null as new tail
        ListNode current = head;   // current starts at head

        //Traverse until current becomes null
        while (current != null) {
            ListNode nextNode = current.next;  //Save next node, not to lose it
            current.next = previous;           //Reverse pointer: current points to previous
            previous = current;                //Move previous forward
            current = nextNode;                //Move current forward
        }
        //After reversal 'previous' is the new head
        return previous;
    }

    //Method to print the list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " → ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of nodes: ");
        int n = scanner.nextInt();

        ListNode head = null;  //start with empty list
        ListNode tail = null;  //keep track of last node

        //Loop to take input and build list
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();   // read data
            ListNode newListNode = new ListNode(data);  // create node

            if (head == null) {
                head = newListNode; //link last node to new node
            } else {
                tail.next = newListNode;      //first node becomes head
            }
            tail = newListNode;      //update tail
        }
        System.out.print("Original List: ");
        printList(head);

        //Reverse the list
        ListNode reversed = reverseList(head);

        System.out.print("Reversed List: ");
        printList(reversed);

        scanner.close();
    }
}

  /*
     ----------------------------- DRY RUN EXAMPLE --------------------------------------
     Input:
     n = 3
     nodes = [1, 2, 3]

     Original List:
     1 → 2 → 3 → null

     Step-by-step reversal:
     previous = null, current = 1
       nextNode = 2
       1.next = null → list: 1 → null
       previous = 1, current = 2

     previous = 1, current = 2
       nextNode = 3
       2.next = 1 → list: 2 → 1 → null
       previous = 2, current = 3

     previous = 2, current = 3
       nextNode = null
       3.next = 2 → list: 3 → 2 → 1 → null
       previous = 3, current = null (loop ends)

     Output:
     Reversed List = 3 → 2 → 1 → null
     -------------------------------------------------------------------------------------------
    */