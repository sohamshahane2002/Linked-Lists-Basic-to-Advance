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
}
public class InsertBeforeValue {
    public static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static Node insertbeforeValue(Node head,int ele, int value){
        if(head==null){
            return null;
        }
        if(head.data == value ){
                return new Node(ele,head);
            }
            Node temp = head;
            while(temp.next!=null){
                
                if(temp.next.data == value){
                    Node n = new Node(ele,temp.next);
                    temp.next = n;
                    break;
                }
                temp =temp.next;
            }return head;
        }

    public static void main(String[] args) {
        int arr[] = {12, 8, 5, 7};
       
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);

        head = insertbeforeValue(head, 100, 5); // Insert before mentioned  value
        printLL(head);
    }
}