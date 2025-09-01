 class ListNode {
     int val;
     ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class delfromback {
    public static void main(String[] args) {
        int arr[] = {1,2};
        ListNode head = arr2ll(arr);
        print(head);
        removeNthFromEnd(head, 2);
        print(head);
    }

    public static void print(ListNode head){
        // if(head == null ) return null;
        // if(head.next==null) return head;

        ListNode temp = head;
        while (temp!=null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static ListNode arr2ll(int[] ar){
        ListNode head = new ListNode(ar[0]);
        ListNode mover =  head;
        for(int i=1; i<ar.length; i++){
            ListNode temp = new ListNode(ar[i]);
            mover.next = temp;
            mover = temp;
           
        }
        return head;
    }
    
    

    public  static ListNode removeNthFromEnd(ListNode head, int n){
        ListNode prev = new ListNode(0);
        prev.next = head;

        ListNode temp = head;
        int length = len(head);
        int last = length-n+1;
        
        int cnt=0;
        if(cnt==length) head = head.next;
        while (temp!=null) {    
            cnt++;
            if(cnt==last){
                prev.next = temp.next;
            }
            else{
                prev = temp;
                temp = temp.next;
            }
        }
        return head;
    }
    public static int len(ListNode  head){
        ListNode temp = head;
        int count = 0;
        while (temp.next!=null) {    
            count++;
            temp = temp.next;
        }
        count++;
        return count;
    }

}
