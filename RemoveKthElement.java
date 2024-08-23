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
public class RemoveKthElement {
    public static Node removekthElement( Node head ,int k){
        if(head==null) return head;
        if(k==1){
            Node temp = head;
            head = head.next;
            return head;
        }
        int cnt = 0 ; 
        Node temp = head ; 
        Node prev =null;
        while(temp != null){
            cnt++;
            if(cnt==k){
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

        
        removekthElement(head,3);
        PrintLL(head);
        
    }
}
