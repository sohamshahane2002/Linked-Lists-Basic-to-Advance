package LinkedLists.SinglyLinkedList;

class Node {
    int data;
    Node next;
    Node(int data1, Node next1) {
        data = data1;
        next = next1;
    }
    Node(int data1) {
        data = data1;
        next = null;
    }
}
public class LL11_SortLL{
public static Node mergeTwoSortedLinkedLists(Node list1, Node list2) {
    // Create a dummy node to serve as the head of the merged list
    Node dummyNode = new Node(-1);
    Node temp = dummyNode;

    while (list1 != null && list2 != null) {
        // Compare elements of both lists and link the smaller node to the merged list
        if (list1.data <= list2.data) {
            temp.next = list1;
            list1 = list1.next;
        } else {
            temp.next = list2;
            list2 = list2.next;
        }
        temp = temp.next; 
    }
    // If any list still has remaining elements, append them to the merged list
    if (list1 != null) {
        temp.next = list1;
    } else {
        temp.next = list2;
    }
    // Return the merged list starting from the next of the dummy node
    return dummyNode.next;
}
public static Node findMiddle(Node head){
    // If the list is empty or has only one node the middle is the head itself
    if (head == null || head.next == null) {
        return head;
    }
    Node slow = head;
    Node fast = head.next;
    // Move the fast pointer twice as fast as the slow pointer
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    // When the fast pointer reaches the end,the slow pointer will be at the middle
    return slow;
}
public static Node sortLL(Node head){
    if (head == null || head.next == null) {
        return head;
    }
    Node middle = findMiddle(head);
    // Divide the list into two halves
    Node right = middle.next;
    middle.next = null;
    Node left = head;
    
    // Recursively sort the left and right halves
    left = sortLL(left);
    right = sortLL(right);
    
    // Merge the sorted halves using the mergeTwoSortedLinkedLists function
    return mergeTwoSortedLinkedLists(left, right);
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
    Node head = new Node(3);
    head.next = new Node(2);
    head.next.next = new Node(5);
    head.next.next.next = new Node(4);
    head.next.next.next.next = new Node(1);

    System.out.print("Original Linked List: ");
    printLinkedList(head);

    // Sort the linked list
    head = sortLL(head);

    System.out.print("Sorted Linked List: ");
    printLinkedList(head);
}
}
