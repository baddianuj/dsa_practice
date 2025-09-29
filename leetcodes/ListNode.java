import java.util.*;
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class swapnodes {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ArrayList<Integer> list = new ArrayList<Integer>();
        ListNode temp = head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        Integer arr[] = list.toArray(new Integer[0]);
        for(int i=1; i<arr.length; i+=2){
            int temp1 = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp1;
        }
        return rethead(arr);

    }
    public ListNode rethead(Integer arr[]){
        ListNode head = new ListNode(arr[0]);
        ListNode mover = head;
        for(int i=1; i<arr.length; i++){
            ListNode temp = new ListNode(arr[i]);
            mover.next = temp;
            mover = mover.next;
        }
        return head;
    }
    public static void main(String[] args) {
        
    }
}