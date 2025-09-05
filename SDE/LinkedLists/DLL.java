class Node{
    int data;
    Node next, prev;


    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;

    }

    Node(int data, Node next, Node prev){
        this.data = data;
        this.next=next;
        this.prev = prev;
    }



}
public class DLL {
    public static void print(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.err.println();
    }



    public static Node arr2dll(int[] arr){
        if (arr.length==0) {
            return null;
        }

        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1; i<arr.length; i++){
            Node node = new Node(arr[i],null,mover);
            mover.next=node;
            mover=node;
        }
        return head;
    }



    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60};
        Node head = arr2dll(arr);
        print(head);
    }

}