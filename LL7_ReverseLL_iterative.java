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
// Function to reverse a linked list using the 3-pointer approach
public class LL7_ReverseLL_iterative {
public static Node reverseLinkedList(Node head) {

   // Initialize'temp' at head of linked list
   Node temp = head;  
   
   // Initialize pointer 'prev' to NULL, representing the previous node
   Node prev = null;  
   
   // Traverse the list, continue till 'temp' reaches the end (NULL)
   while(temp != null){  
       // Store the next node in 'front' to preserve the reference
       Node front = temp.next;  
       
       // Reverse the direction of the current node's 'next' point to point to 'prev'
       temp.next = prev;  
       
        // Move 'prev' to the current node for the next iteration
       prev = temp;  
       
        // Move 'temp' to the 'front' node advancing the traversal
       temp = front; 
   }
   // Return the new head of the reversed linked list
   return prev;  
    }

    // Function to print the linked list
    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(0);
        head.next = new Node(3);
        head.next.next = new Node(2);
        head.next.next.next = new Node(4);

        System.out.print("Original Linked List: ");
        printLinkedList(head);

        head = reverseLinkedList(head);

        System.out.print("Reversed Linked List: ");
        printLinkedList(head);
    }
}
