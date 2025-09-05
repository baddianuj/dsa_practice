

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

    private static Node addele(Node head, int val){
       return new Node(val, head);
    }

    private static Node addlast(Node head, int val){
        if(head==null) return new Node(val);
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = new Node(val);
        return head;
    }

    private static Node addk(Node head, int val, int k){
        // if(head==null || k==1) {
        //     return new Node(val,head);
        // }

        // if(head==null){
        //     if(k==1) return new Node(val);
        //     else{
        //         return head;
        //     }
        // }
        if(head==null && k==1) {
            return new Node(val);
        }

        if(head==null){
            return new Node(val);

        }

        if(k==1){
            return new Node(val,head);
        }
        
        
        int count=0;
        Node temp = head;
        Node prev = null;
        while (temp!=null) {
            count++;
            if(count == k){
                Node xyz = new Node(val);
                prev.next = xyz;
                xyz.next=temp.next;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
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
        head = removeHead(head);
        print(head);
        head = removeTail(head);
        print(head);

        print(removeK(head, 2));
        print(removeEle(head, 3));
        Node h1 =addele(head, 66);
        print(h1);
        print(addlast(h1, 157));
        print(h1);
        print(addk(h1, 89, 4));
        print(h1);
        print(addk(h1, 69, 1));
    }
}
