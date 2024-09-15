package LinkedLists.SinglyLinkedList;

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
public class LL13_DeleteNth {
    public static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    // Function to delete the Nth node from the end of the linked list
    public static Node DeleteNthNodefromEnd(Node head, int N) {
        // Create two pointers, fastp and slowp
        Node fastp = head;
        Node slowp = head;

        // Move the fastp pointer N nodes ahead
        for (int i = 0; i < N; i++)
            fastp = fastp.next;

        // If fastp becomes null, the Nth node from the end is the head
        if (fastp == null)
            return head.next;

        // Move both pointers until fastp reaches the end
        while (fastp.next != null) {
            fastp = fastp.next;
            slowp = slowp.next;
        }
        // Delete the Nth node from the end
        Node delNode = slowp.next;
        slowp.next = slowp.next.next;
        delNode = null;
        return head;
    }
    public static void main(String[] args) {
    
        int n = 3;
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        head = DeleteNthNodefromEnd(head, n);
        printLL(head);
    }
}
