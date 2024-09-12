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
public class LL10_isPalindromeLL{
    public static Node reverseLinkedList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        //Reverse the remaining part of the list and get the new head
        Node newHead = reverseLinkedList(head.next);
        Node front = head.next;

        // Update the 'next' pointer of 'front' to
        // point to the current head, effectively
        // reversing the link direction
        front.next = head;

        // Set the 'next' pointer of the
        // current head to 'null' to
        // break the original link
        head.next = null;
        return newHead;
    }
    public static boolean isPalindrome(Node head) {
        // Check if the linked list is empty or has only one node
        if (head == null || head.next == null) {
            return true;
        }
        Node slow = head;
        Node fast = head;
    
        // Traverse the linked list to find the middle using slow and fast pointers
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
    
        // Reverse the second half of the linked list starting from the middle
        Node newHead = reverseLinkedList(slow.next);
    
        // Pointer to the first half
        Node first = head;

        // Pointer to the reversed second half
        Node second = newHead;
        while (second != null) {
            // Compare data values of
            // nodes from both halves
            if (first.data != second.data) {
                // Reverse the second half back to its original state
                reverseLinkedList(newHead);
                return false;
            }
            first = first.next;
            second = second.next;
        }
        reverseLinkedList(newHead);
        return true;
    }   
    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Create a linked list with values 2, 3, 1, 3, and 2 (23132, a palindrome)
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(1);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(2);
        System.out.print("Original Linked List: ");
        printLinkedList(head);

        if (isPalindrome(head)) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    }

}