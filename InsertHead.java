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
}public class InsertHead {
    public static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static Node insertHead(Node head, int val) {
        Node temp = new Node(val, head);
        return temp;
    }
    public static void main(String[] args) {
        int arr[] = {12, 8, 5, 7};
        int val = 100;

        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);

        head = insertHead(head, val);
        printLL(head);
    }
}

