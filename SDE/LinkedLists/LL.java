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

    private static void print(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
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

    private static Node removeHead(Node head){

        // Node temp = head;
        if(head == null) return head;
        head = head.next;
        return head;
    }

    private static Node removeTail(Node head){
        if(head==null || head.next == null) return null;
        Node temp = head;
        while (temp.next.next!=null){
            temp = temp.next;
        }
        temp.next=null;
        return head;
        
    }

    private static Node removeK(Node head, int k){
        if(head==null || head.next == null) return null;
        if(k==1){
            head = head.next;
            return head;
        }
        int count=0;
        Node temp = head;
        Node prev = null;
        while(temp!=null){
            count++;
            if(count==k){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    private static Node removeEle(Node head, int val){
        if(head == null || head.next==null) return null;
        if(head.data == val){
            head = head.next;
            return head;
        }

        Node temp = head;
        Node prev = null;
        while(temp.next!=null){
            if(temp.data == val){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;

    }

    private static Node add(Node head, int val){
        if(head==null){
            Node temp = new Node(val);
            head = temp;
            return head;
        }
        if(head.next==null){
            
        }
        return head;

    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        Node head = arr2ll(arr);
        // // System.out.println(head.data);
        // Node temp = head;
        // while (temp!=null){
        //     System.out.print(temp.data + " ");
        //     temp = temp.next;
        // }
        // System.out.println();
        // System.out.println(length(head));
        // System.out.println(search(head, 5));
        // head = removeHead(head);
        // print(head);
        // head = removeTail(head);
        // print(head);

        print(removeK(head, 2));
        print(removeEle(head, 3));

    }
}
