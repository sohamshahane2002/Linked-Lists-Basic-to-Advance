package LinkedLists.SinglyLinkedList.Deletion;

class Node {
    int data;
    Node next;

    Node(int data1 , Node next1){
        this.data = data1;
        this.next = next1;
    }
    Node(int data1){
        this.data =data1;
        this.next =null;
    }
}
public class RemoveTail {
    private static Node removeTail(Node head ){
        if(head == null || head.next ==null)
            return null;
        
        Node temp = head;
        while( temp.next.next != null){
            temp =temp.next;
        }
        temp.next = null;
        return head;
    }
    private static void PrintLL(Node head){
        while(head != null){
            System.out.print(head.data  + " ");
            head = head.next;
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        int arr[] =  {1,2,3,4};
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);

        head = removeTail(head);
        PrintLL(head);
    }
}
