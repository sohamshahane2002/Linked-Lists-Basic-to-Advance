package LinkedLists.SinglyLinkedList.Insertion;
class Node {
    public int data;
    public Node next;

    public Node(int data1, Node next1) {
        data = data1;
        next = next1;
    }
    public Node(int data1) {
        data = data1;
        next = null;
    }
}
public class InsertTail {
    public static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static Node insertTail(Node head, int val) {
        // Create a new node for the element
        Node newNode = new Node(val);
        // If the list is empty, set the new node as the head
        if (head == null) {
            return newNode;
        }
        // Traverse to the last node
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        // Set the next pointer of the last node to the new node
        current.next = newNode; 
        return head; // Head remains the same
    }
    public static void main(String[] args) {
        int arr[] = {12, 8, 5, 7};
        int val = 100;

        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);

        head = insertTail(head, val); // Insert at tail
        printLL(head);
    }
}