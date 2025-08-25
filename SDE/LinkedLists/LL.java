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

    private static int length (Node head){
        Node temp = head;
        int count = 0;
        while (temp!=null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    private static boolean search(Node head, int val){
        Node temp = head;
        while (temp!=null) {
            if (temp.data == val) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        Node head = arr2ll(arr);
        // System.out.println(head.data);
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        System.out.println(length(head));
        System.out.println(search(head, 5));

    }
}
