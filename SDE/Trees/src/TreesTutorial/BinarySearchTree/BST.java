package TreesTutorial.BinarySearchTree;

import java.util.DoubleSummaryStatistics;
import java.util.HexFormat;
import java.util.Scanner;

public class BST {
    BST(){

    }
    public class Node{
        private int val;
        private Node left;
        private Node right;
        private int height;

        Node(int val) {
            this.val = val;
        }

        public  int getVal(){
            return val;
        }
    }


    private Node root;


    public int height(Node node){
        if(node==null) return -1;
        return node.height;
    }

    public int height(){
        return height(root);
    }

    public boolean isEmpty(){
        return root==null;
    }

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
        if(value >= node.val){
            node.right = insert(value, node.right);
        }
        node.height = Math.max(height(node.left), height(node.right)) +1;
        return (node);
    }


    public boolean balanced(){return balanced(root);}

    private boolean balanced(Node node){
        if(node == null) {
            return true;
        }

        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }
}
