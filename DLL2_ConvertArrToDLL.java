package LinkedLists.DoublyLinkedList;

class Node {
    int data;      //data in node
    Node next;     //ref to next node
    Node back;     //ref to prev node
    public Node(int data, Node next ,Node back) {              // Constructor for a Node with both data and a ref to the next node and to prev node
        this.data = data;
        this.next = next;
        this.back = back;
    }
    public Node(int data) {                         // Constructor for a Node with data and no reference to the next node and to prev node
        this.data = data;
        this.next = null;
        this.back = null;
    }
}
public class DLL2_ConvertArrToDLL{
    private static void printDLL (Node head){
        while(head!=null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println(); 
    }

    private static Node convertArr2DLL(int[] arr) {
        // Create the head node with the first element of the array
        Node head = new Node(arr[0]);
        // Initialize 'prev' to the head node
        Node prev = head;

        for (int i = 1; i < arr.length; i++) {
            // Create a new node with data from the array and set its 'back' pointer to the previous node
            Node temp = new Node(arr[i], null, prev);
            // Update the 'next' pointer of the previous node to point to the new node
            prev.next = temp;
            // Move 'prev' to the newly created node for the next iteration
            prev = temp;
        }
        return head;
    }


    public static void main(String[] args) {
    int arr[] ={2,5,6,8};
    Node head = convertArr2DLL(arr);
    printDLL(head);
    
    }
}