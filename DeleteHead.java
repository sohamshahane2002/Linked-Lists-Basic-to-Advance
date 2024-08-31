package LinkedLists.DoublyLinkedList.Deletion;

class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
class DoublyLinkedList {
    Node head;
    public DoublyLinkedList() {
        head = null;
    }
    // Method to delete the head node
    public void deleteHead() {
        // Check if the list is empty
        if (head == null) {
            System.out.println("List is empty. No node to delete.");
            return;
        }
        // If there's only one node in the list
        if (head.next == null) {
            head = null;  // The list becomes empty after deletion
            return;
        }
        // If there are multiple nodes
        head = head.next;  // Move the head to the next node
        head.prev = null;  // Set the previous of the new head to null
    }

    // Method to display the list 
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Method to add a node
    public void addToHead(int data) {
        Node newNode = new Node(data);
        if (head != null) {
            head.prev = newNode;
            newNode.next = head;
        }
        head = newNode;
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        // Adding nodes to the head
        dll.addToHead(10);
        dll.addToHead(20);
        dll.addToHead(30);

        System.out.println("Original List:");
        dll.display();

        // Deleting the head node
        dll.deleteHead();
        System.out.println("After Deleting Head:");
        dll.display();
    }
}