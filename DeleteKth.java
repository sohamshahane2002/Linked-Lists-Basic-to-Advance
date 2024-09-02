package LinkedLists.DoublyLinkedList.Deletion;
class Node{
    public int data;
    public Node next;
    public Node prev;

    Node(){
        this.data = 0;
        this.next = null;
        this.prev = null;
    }
    Node(int data){ 
        this.data = data;
        this.next = null;
        this.prev = null;
    }
    Node(int data, Node next, Node prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}
public class DeleteKth {
    public static Node deleteNode(Node head, int k) {
        // If the list is empty or k is less than 1, return the list as is.
        if (head == null || k < 1) {
            return head;
        }
        // If k is 1, delete the head node.
        if (k == 1) {
            Node newHead = head.next;
            if (newHead != null) {
                newHead.prev = null;
            }
            return newHead;
        }
        head.next = deleteNode(head.next, k - 1);
        if (head.next != null) {
            head.next.prev = head;
        }
        return head;
    }
    public static void PrintDll(Node head){
        while(head!=null){
            System.out.print(head.data  + " ");
            head=head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(11);
        head.next = new Node(12);
        head.next.next = new Node(13);
        head.next.next.next = new Node(14);
        
        head = deleteNode(head, 2);
        PrintDll(head);

    }
}

