package javaapplication205;
class ListNode {
    int val;
    ListNode next;
    
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedListReverse {
    public static ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode nextNode;
        
        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        
        return prev;
    }
    
    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }
    
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        
        System.out.println("Original linked list:");
        printLinkedList(head);
        
        ListNode reversedHead = reverseLinkedList(head);
        
        System.out.println("\nReversed linked list:");
        printLinkedList(reversedHead);
    }
}
