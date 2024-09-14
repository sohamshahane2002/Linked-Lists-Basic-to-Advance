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
public class LL12_DeleteMiddle{
    private static Node deleteMiddle(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node slow = head;
        Node fast = head;
        fast = head.next.next;

        // Move 'fast' pointer twice as fast as 'slow'
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // Delete the middle node by skipping it
        if (slow.next != null) {
            slow.next = slow.next.next;
        }
        return head;
    }
    private static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Creating a sample linked list:
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.print("Original Linked List: ");
        printLL(head);

        // Deleting the middle node
        head = deleteMiddle(head);

        System.out.print("Updated Linked List: ");
        printLL(head);
    }
}