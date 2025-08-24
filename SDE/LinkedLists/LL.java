import java.util.*;

class Node{
    int data;
    Node next;

    Node(int data1){
        this.data = data1;
        this.next = null;
    }
    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }
}

public class LL{
    private static Node arr2ll(int arr[]){
        Node head = new Node(arr[0]);
        Node mover = head;

        for(int i=1; i<arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        Node head = arr2ll(arr);
        System.out.println(head.data);
        // System.out.println(arr2ll(arr));
    }
}
