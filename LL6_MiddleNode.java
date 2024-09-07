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
public class LL6_MiddleNode {
    
    static Node findMiddle(Node head) {
        // Initialize the slow pointer to the head.
        Node slow = head; 
        // Initialize the fast pointer to the head.
        Node fast = head;   
        // Traverse the linked list using the Tortoise and Hare algorithm.
        while (fast != null && fast.next != null && slow != null) {
            // Move fast two steps.
            fast = fast.next.next;  
            // Move slow one step.
            slow = slow.next;        
        }
        // Return the slow pointer which is now at the middle node.
        return slow;  
    }
    public static void main(String[] args) {
        
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node middleNode = findMiddle(head);
        System.out.println("The middle node value is: " + middleNode.data);
    }
}
                         