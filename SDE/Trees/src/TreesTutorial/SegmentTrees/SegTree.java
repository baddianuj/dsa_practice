package TreesTutorial.SegmentTrees;

public class SegTree {
    public static void main(String[] args) {
        int arr[] = {3,8,7,6,-2,-8,4,9};
        SegTree tree = new SegTree(arr);
        tree.display();
        System.out.println(tree.query(0,7));

    }

    public class Node{
        int val;
        Node left;
        Node right;
        int start;
        int end;

        public Node(int start, int end) {
            this.start=start;
            this.end=end;
        }
    }

    public Node root;

    public SegTree(int[] arr){
        this.root = constructTree(arr, 0, arr.length-1);
    }

    private Node constructTree(int arr[], int start, int end){
        if(start==end){
            Node leaf = new Node(start, end);
            leaf.val = arr[start];
            return leaf;
        }

        //create new node with index you are at!

        Node node = new Node(start,end);
        int mid = start+(end-start)/2;

        node.left = this.constructTree(arr,start,mid); // can use normallly no need of this. just for explainations.
        node.right = this.constructTree(arr,mid+1,end);

        node.val = node.left.val + node.right.val;
        return node;

    }

    public void display(){
        display(root);
    }

    private void display(Node node){
        String str = "";
        if(node.left!=null){
            str = str + "Interval=[" + node.left.start + "," + node.left.end + "] and data=" + node.left.val +"\n";
        } else {
            str = str + "No left child";
        }

        //for current node
        str = str + "Interval=[" + node.start + "," + node.end + "] and data=" + node.val  +"\n";

        if(node.right!=null){
            str = str + "Interval=[" + node.right.start + "," + node.right.end + "] and data=" + node.right.val + "\n";
        } else {
            str = str + "No right child";
        }

        System.out.println(str);

        if(node.left!=null) display(node.left);
        if(node.right!=null) display(node.right);
    }

    public int query(int start, int end){
        return query(root, start, end);
    }
    private int query(Node node, int s, int e){
        if(node.start>=s && node.end<=e){
            return node.val;
        } else if(node.start > e || node.end < s) return 0;
        else{
            return query(node.left, s, e) +query(node.right, s, e);
        }

    }

    public void update(int idx, int val){
        update(root, idx, val);
    }
    private int update(Node node, int idx, int val){
        if(idx>=node.start && idx<=node.end){
            if(idx==node.start && idx==node.end){
                node.val = val;
                return node.val;
            }
            else{
                node.val = update(node.left, idx, val) + update(node.right, idx, val);
                return node.val;
            }
        }
        return node.val;
    }
}
