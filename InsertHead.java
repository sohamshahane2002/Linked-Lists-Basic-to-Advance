package LinkedLists.DoublyLinkedList.Insertion;

class Node
{
    public int value;
    public Node next;
    public Node prev;

    Node()
    {
        this.value = 0;
        this.next = null;
        this.prev = null;
    }

    Node(int value)
    {
        this.value = value;
        this.next = null;
        this.prev = null;
    }

    Node(int value, Node next, Node prev)
    {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }
}

public class InsertHead {
    public static Node insertAtFront(Node head, int k) {
        Node newNode = new Node(k);

        if (head == null) {
            return newNode;
        }

        newNode.next = head;
        head.prev = newNode;

        return newNode;
    }
    public static void PrintLL(Node head){
        while(head!=null){
            System.out.print(head.value + " ");
            head = head.next;
        }System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(11);
        head.next = new Node(12);
        head.next.next = new Node(13);
        head.next.next.next = new Node(14);

        head = insertAtFront(head, 10);
        PrintLL(head);

    }
}
