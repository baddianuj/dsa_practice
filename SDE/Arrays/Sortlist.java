
 public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }





public class Sortlist{
    public static ListNode sortlist(ListNode head){
        
    }
    public static int length(ListNode head){
        ListNode temp = head;
        int count=0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}