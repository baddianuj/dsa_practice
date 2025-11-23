package TreesTutorial;

import java.util.*;
public class TreeNode {

    public TreeNode () {

    }

    static public class Node{
    int val;
    Node left;
    Node right;

    Node(int val){
        this.val = val;
    }}


    public Node root;

    public  void populate(Scanner sc){
        System.out.println("enter the root node val");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc, root);
    }

    public void populate(Scanner sc, Node node){

        System.out.println("enter left of " + node.val + " ?");
        boolean left = sc.nextBoolean();
        if(left){
            System.out.println("enter left value : ");
            int val = sc.nextInt();
            node.left = new Node(val);
            populate(sc, node.left);
        }
        System.out.println("enter right of " + node.val + " ?");
        boolean right = sc.nextBoolean();
        if(right){
            System.out.println("enter right value : ");
            int val = sc.nextInt();
            node.right = new Node(val);
            populate(sc, node.right);
        }
    }

    public void display(){
        display(root, "");
    }
    public void display(Node root, String s){
        if (root==null) return;
        System.out.println(s + root.val);
        display(root.left, s + "\t");
        display(root.right, s + "\t");

    }

    public  void prettyDisplay(){
        prettyDisplay(root, 0);
    }

    public void prettyDisplay(Node node, int lvl){
        if(node==null) return;

        prettyDisplay(node.right, lvl + 1);

        if (lvl!=0){
            for (int i = 0; i < lvl-1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------>" + node.val);
        } else {
            System.out.println(node.val);
        }
        prettyDisplay(node.left, lvl + 1);
    }
}

