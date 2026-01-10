package TreesTutorial.BFS;
import java.util.*;


public class BFS {
    BFS(){

    }
    public class Node{
        int val;
        Node left;
        Node right;
        int height;

        Node(int val){
            this.val=val;
        }

    }

    public class customQueue{
        Node[] arr = new Node[100];
        int start=0, end = 0, first=0;

        void offer(Node node){
            arr[end++] = node;
        }

        Node poll(){
            if(start==end) return new Node(-1);
            return arr[start++];
        }

        int size(){
            return end-start+1;
        }

        Node peek(){
            if(start==end) return new Node(-1);
            return arr[start];
        }
    }
    public customQueue queue;

    public Node root;

    public void createTree(){
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        root = new Node(value);
        createTree(root, sc);
    }

    public int height(){
        return height(root);
    }
    private int height(Node node){
        return node.height;
    }

    private void createTree(Node node, Scanner sc){
        System.out.println("enter left  of  " + node.val + "?");
        boolean lr = sc.nextBoolean();
        if(lr){
            System.out.println("enter left val of " + node.val);
            int value = sc.nextInt();
            node.left = new Node(value);
             createTree(node.left, sc);
        }
        System.out.println("enter right of "+ node.val + "?");
        boolean lr1 = sc.nextBoolean();
        if(lr1){
            System.out.println("enter right val: "+ node.val);
            int value = sc.nextInt();
            node.right= new Node(value);
            createTree(node.right, sc);
        }
        node.height = Math.max(height(node.left), height(node.right))+1;

    }

    public void print(){
        queue = new customQueue();
        print(root);
    }
    private void print(Node node){
//        if(node==null) return;
//        queue.offer(node);
//        queue.offer(node.left);
//        queue.offer(node.right);
//
//        Node temp = queue.poll();
//        System.out.print(temp.val + " ");
//        print(queue.peek());

        if(root==null) return;

        queue.offer(root);
        while(queue.start != queue.end){
            Node curr = queue.poll();
            System.out.print(curr.val + " ");

            if(curr.left!=null) queue.offer(curr.left);
            if(curr.right!=null) queue.offer(curr.right);
        }
    }


    public void createTree2() {

        this.root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.left.left.left = new Node(8);
        root.left.left.right = new Node(9);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        root.right.left.left = new Node(10);
        root.right.right.right = new Node(11);
    }

}
