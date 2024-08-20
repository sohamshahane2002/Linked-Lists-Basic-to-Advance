package LinkedLists.SinglyLinkedList;
class Node{
    int data ;
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
public class LL3_Search {
    public static int searchEle(Node head ,int desiredelement ){
        Node temp = head;     //initiate pointer temp on head
        while(temp != null){    //traverse through the LinkedList when node is not null and check if desired element is equal to node data.
            if(temp.data == desiredelement)
                return 1;
                temp = temp.next;            
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);

        int desiredelement = 3;         
        System.out.print(searchEle(head, desiredelement));
    }
    
    
}
