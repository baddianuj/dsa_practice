package TreesTutorial.AVLTrees;


public class AVL {
    public class Node {
        private  int val;
        private  Node left;
        private Node right;
        private int height;

        Node (int val) {
            this.val = val;
        }
        public int getVal() { return val;}
    }

    private Node root;

    private int height(Node node){
        if(node==null) return -1;
        return node.height;
    }
    public int height(){
        return height(root);
    }

    public boolean isEmpty() {return root==null;}


    public void insert(int val){
        root = insert(val, root);
    }
    private Node insert(int value, Node node){
        if(node==null){
            node = new Node(value);
            return node;
        }

        if(value< node.val){
            node.left = insert(value, node.left);
        }
         if(value > node.val){
            node.right = insert(value, node.right);
        }
        node.height = Math.max(height(node.left), height(node.right))+1;
        return rotate(node);
    }

    private Node rotate(Node node){
        if(height(node.left) - height(node.right) > 1) {
            //left heavy
            if(height(node.left.left) - height(node.left.right )> 0) {
                //left left case
                rightRotate(node);
            }
            if(height(node.left.left) - height(node.left.right)< 0) {
                //left right
                node.left  = leftRotate(node);
                return rightRotate(node);
            }
        }
        if(height(node.left) - height(node.right) < -1) {
            //right heavy
            if(height(node.right.left) - height(node.right.right )> 0) {
                //right left case
                node.right = rightRotate(node);
                return leftRotate(node);

            }
            if(height(node.right.left) - height(node.right.right)< 0) {
                //righht right case
                return leftRotate(node);
            }
        }
        return node;
    }

    private Node rightRotate(Node p){
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left), height(p.right))+1;
        c.height = Math.max(height(c.left), height(c.right))+1;

        return c;
    }

    private Node leftRotate(Node p){
        Node c = p.right;
        Node t = c.left;

        c.left = p;
        p.right = t;

        p.height = Math.max(height(p.left), height(p.right))+1;
        c.height = Math.max(height(c.left), height(c.right))+1;

        return c;
    }


    public boolean balanced(){
        return balanced(root);
    }

    private boolean balanced(Node node){
        if(node==null) return true;
        return Math.abs(height(node.left)- height(node.right)) <=1 && balanced(node.left) && balanced(node.right);
    }


}

