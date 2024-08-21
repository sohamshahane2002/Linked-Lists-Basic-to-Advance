package LinkedLists.SinglyLinkedList;

class Node{
    int data;
    Node next;

    Node(int data1 , Node next1){              //constructor with data and next pointer
        this.data = data1;     
        this.next = next1;
    }
    Node(int data1){                           //constructor with data and null pointer
        this.data = data1;
        this.next = null;
    }
}
public class LL5_ConvertArrToLL {             
    private static Node converttoLL(int arr[]){   //function to convert array to linkedlist
        Node head = new Node(arr[0]);             //node head pointing to first element
        Node mover = head;     //pointer mover placed on which will iterate thorugh the array
        for(int i = 1; i < arr.length ;  i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
       }
    return head;
    }
    private static void printLL(Node head){   //prints the linked list
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
    }System.out.println();
    }
    
 
    public static void main(String[] args) {//node head pointing to first element
        int arr[] = {2,5,8,7};
        Node head = converttoLL(arr);
    
        printLL(head);
    }
}
