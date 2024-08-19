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


public class LL1_Create {
    public static void main(String[] args) {
        int arr[] ={2,5,6,8};
        Node y = new Node(arr[1]);   //stores the value from the give array
        System.out.println(y.data);  //displays the value
    }
}
