package LinkedLists.DoublyLinkedList;
public class ReverseDLL {
    public static class Node {
        public int data;
        public Node next;
        public Node back;

        public Node(int data1, Node next1, Node back1) {
            data = data1;
            next = next1;
            back = back1;
        }
        public Node(int data1) {
            data = data1;
            next = null;
            back = null;
        }
    }
    private static Node convertArr2DLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);    
            prev.next = temp;
            prev = temp;
        }
        return head;
    }
    private static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next; 
        }
        System.out.println();
    }  
    private static Node reverseDLL(Node head) {
        // Check if the list is empty or has only one node
        if (head == null || head.next == null) {
            return head; 
        }
        // Initialize a pointer to the previous node        
        Node prev = null;
        
        // Initialize a pointer to the current node
        Node current = head;
        
        // Traverse the linked list
        while (current != null) {            
            // Store a reference to the previous node
            prev = current.back;        
            // Swap the previous and next pointers
            current.back = current.next;            
            // This step reverses the links
            current.next = prev;
            // Move to the next node in the orignal list 
            current = current.back;
        }
        // The final node in the original list becomes the new head after reversal
        return prev.back;
    }
    public static void main(String[] args) {
        int[] arr = {12, 5, 6, 8, 4};
        Node head = convertArr2DLL(arr);
        System.out.println(" Doubly Linked List Initially: ");
        print(head);
        System.out.println("Doubly Linked List After Reversing :");
        head = reverseDLL(head);
        print(head);
    }
}