 class Node{
    int data;
    Node next;
    Node prev;

    Node(int data, Node next, Node prev){
        this.data = data;
        this.next=next;
        this.prev=prev;
    }
    Node(int data){
        this.data = data;
        this.next=null;
        this.prev=null;
    }
}

public class DLL{
    private static void print(Node head){
        Node temp = head;
        while(temp.next!=null){
            System.out.print(temp.data + " ");;
        }
        System.out.println();
    }


    

    public static void main(String[] args) {
        int arr[] = {6,8,1,2,4,3,9,5,7,4};
    }
}