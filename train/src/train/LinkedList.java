
package train;
// Java program to detect loop in a linked list
import java.util.*;
public class LinkedList {
    static Node head; // head of list
    /* Linked list Node*/
    static class Node {
        int data;
        Node next;
        private int flag;
        Node(int x)
        {
            data = x;
            next = null;
        }
    }
    /* Inserts a new Node at front of the list. */
    static public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }
    static boolean detectLoop(Node h)
    {    int flag =0;
       while(h!=null)
       {
           if(h.flag==1) 
            return true;
           h.flag=1;
           h=h.next;
       }
       return false;
    }

    /* Driver program to test above function */
    public static void main(String[] args)
    {
        LinkedList llist = new LinkedList();

        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);

        /*Create loop for testing */
        llist.head.next.next.next.next = llist.head;

        if (detectLoop(head))
            System.out.println("Loop Found");
        else
            System.out.println("No Loop");
    }
}

    

