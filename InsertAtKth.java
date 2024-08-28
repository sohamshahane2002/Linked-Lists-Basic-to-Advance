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
public class InsertAtKth {
    public static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static Node insertK(Node head,int ele, int k){
        if(head==null){
            if(k==1)
            return new Node (ele);
            else return null;
        }
        if(k==1){
            Node temp = new Node(ele,head);
                return temp;
            }

            int cnt = 0;
            Node temp = head;

            while(temp!=null){
                cnt++;
                if(cnt==k-1){
                    Node n = new Node(ele);
                    n.next = temp.next;
                    temp.next = n;
                    break;
                }
                temp =temp.next;
            }return head;
        }

    public static void main(String[] args) {
        int arr[] = {12, 8, 5, 7};
        int val = 100;

        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);

        head = insertK(head, val, 2); // Insert at position
        printLL(head);
    }
}