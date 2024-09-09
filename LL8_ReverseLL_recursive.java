package LinkedLists.SinglyLinkedList;

class Node {
    
    int data;
    Node next; 
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LL8_ReverseLL_recursive   {
    // Function to reverse a singly linked list using a recursion
    public static Node reverseLinkedList(Node head) {
        
        if (head == null || head.next == null) {
            return head;
        }
        // Reverse the linked list starting from the second node (head.next).
        Node newHead = reverseLinkedList(head.next);
        
        // Save a reference to the node following the current 'head' node.
        Node front = head.next;
        
        // Make the 'front' node point to the current 'head' node in the reversed order.
        front.next = head;
        
        // Break the link from the current 'head' node to the 'front' node to avoid cycles.
        head.next = null;
        
        // Return the 'newHead,' which is the new head of the reversed linked list.
        return newHead;
    }
    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(2);
        head.next.next.next = new Node(4);

        System.out.print("Original Linked List: ");
        printLinkedList(head);

        head = reverseLinkedList(head);

        System.out.print("Reversed Linked List: ");
        printLinkedList(head);
    }
}
