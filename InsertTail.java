package LinkedLists.DoublyLinkedList.Insertion;

public class InsertTail {
    public static class Node {
        public int data;
        public Node next;
        public Node back;

        // Constructor for a Node with both data, a reference to the next node, and a reference to the previous node
        public Node(int data1, Node next1, Node back1) {
            data = data1;
            next = next1;
            back = back1;
        }
        // Constructor for a Node with data, and no references to the next and previous nodes (end of the list)
        public Node(int data1) {
            data = data1;
            next = null;
            back = null;
        }
    }
    private static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next; 
        }
        System.out.println();
    }
    private static Node insertAtTail(Node head, int k) {
        Node newNode = new Node(k);
        if (head == null) {
            return newNode;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.back = current;
        return head;
        }
    public static void main(String[] args) {
        int[] arr = {12, 5, 6, 8};
        
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        
        System.out.println("Doubly Linked List Initially: ");
        print(head);

        System.out.println("Doubly Linked List After Inserting before the node with value 8:");

        head = insertAtTail(head, 10);
        print(head);

    }
}
