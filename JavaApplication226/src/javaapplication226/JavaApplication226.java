
package javaapplication226;
class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}

class MyLinkedList {
    Node head;

    MyLinkedList(Node head) {
        this.head = head;
    }

    public void swapDuplicates() {
        if (head == null || head.next == null) {
            return; 
        }

        Node firstDuplicatePrev = null, secondDuplicatePrev = null;
        Node firstDup = null, secondDup = null;
        Node current = head, prev = null;

        while (current != null && firstDup == null) {
            Node temp = current.next;
            while (temp != null) {
                if (current.value == temp.value) {
                    firstDup = current;
                    firstDuplicatePrev = prev;
                    secondDup = temp;
                    break;
                }
                temp = temp.next;
            }
            if (firstDup == null) {
                prev = current;
                current = current.next;
            }
        }

        if (firstDup == null || secondDup == null) {
            return; 
        }

        
        if (firstDuplicatePrev == null) {
            head = secondDup;
        } else {
            firstDuplicatePrev.next = secondDup;
        }

        
        Node temp1 = secondDup.next;
        secondDup.next = firstDup.next;
        firstDup.next = temp1;

        
        if (firstDup.next == secondDup) {
            firstDup.next = secondDup.next;
            secondDup.next = firstDup;
        } else {
            
            if (prev != null) {
                prev.next = firstDup;
            } else {
                head = firstDup;
            }
        }
    }
    
