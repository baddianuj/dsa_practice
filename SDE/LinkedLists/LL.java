import java.util.*;
public class LL {

    private Node Head;
    private Node Tail;

    private int size;

    public LL(){
        this.size = 0;
    }

    private class Node{
        private int data;
        private Node next;

        public Node(int val){
            this.data = val;
        }

        public Node(int val, Node next1){
            this.data = val;
            this.next = next1;
        }

    }
}
