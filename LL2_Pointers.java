package LinkedLists.SinglyLinkedList;
class Node{
    int data;
    Node next;

    public Node(int data1 , Node next1){
        this.data = data1;
        this.next = next1;
    }
    public Node(int data1){
        this.data = data1;
        this.next = null;
    }

}
public class LL2_Pointers {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        Node x = new Node(arr[0]); //stores in '1' from the array into the the 'x' node
        Node y = x ;                //stores the address of the 'x' node
        System.out.println(y);       //displays the address
       
    }
}
