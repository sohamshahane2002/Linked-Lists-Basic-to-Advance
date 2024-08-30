package LinkedLists.DoublyLinkedList;

    class Node {
        int data;      //data in node
        Node next;     //ref to next node
        Node back;     //ref to prev node
        public Node(int data, Node next ,Node back) {              // Constructor for a Node with both data and a ref to the next node and to prev node
            this.data = data;
            this.next = next;
            this.back = back;
        }
        public Node(int data) {                         // Constructor for a Node with data and no reference to the next node and to prev node
            this.data = data;
            this.next = null;
            this.back = null;
        }
    }
    public class DLL1_Create {
        private static void printDLL (Node head){
            while(head!=null){
                System.out.print(head.data + " ");
                head = head.next;
            }
            System.out.println(); 
        }
        public static void main(String[] args) {
        int arr[] ={2,5,6,8};
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);   //stores the value from the give array
        head.next.next = new Node(arr[2]); 
        head.next.next.next = new Node(arr[3]); 
        printDLL(head);
        }
}
