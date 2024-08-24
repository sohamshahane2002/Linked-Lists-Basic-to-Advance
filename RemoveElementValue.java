package LinkedLists.SinglyLinkedList.Deletion;

class Node{
    int data;
    Node next;
    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }
    Node(int data1){
        this.data = data1;
        this.next = null;
    }
} 
public class RemoveElementValue {
    public static Node removeElementvalue( Node head ,int element){
        if(head==null) return head;
        if(head.data==element){
            Node temp = head;
            head = head.next;
            return head;
        }
        Node temp = head ; 
        Node prev =null;
        while(temp != null){
            if(temp.data == element){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head; 
    }
    public static void PrintLL(Node head){
        while(head != null){
            System.out.print( head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        head.next.next.next.next = new Node(arr[4]);

        removeElementvalue (head,4);
        PrintLL(head);        
    }
}
