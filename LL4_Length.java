package LinkedLists.SinglyLinkedList;
class Node{
    int data;
    Node next;

    Node(int data1 , Node next1){
        this.data = data1;
        this.next = next1;
    }
    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}
public class LL4_Length {
    public static int lengthofLL( Node head){
        Node temp = head;       //initiate pointer temp on head
        int cnt = 0 ;           //initiate temp variable

        while( temp != null){  //traverse through linkedlist and count nodes
            temp = temp.next;
            cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next= new Node(arr[2]);
    
        System.out.println(lengthofLL(head));    
    }
}
