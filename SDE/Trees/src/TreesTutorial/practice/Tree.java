package TreesTutorial.practice;

import java.util.Objects;
import java.util.Scanner;

public class Tree {
    public static class Node{
         int val;
         Node left;
         Node right;

        Node(int val){
            this.val=val;
        }
    }

    public static Node root;


//    public void populate(Scanner sc){
//        System.out.println("enter root Node: ");
//        int val = sc.nextInt();
//        root = new Node(val);
//
//        populate(sc, root);
//    }
//
//    private void populate(Scanner sc, Node node){
//        System.out.println(" enter left or right of "+node.val+" ? ........l/r");
//        String c = sc.next();
//        if(Objects.equals(c, "l")){
//            System.out.println("enter left node val");
//            int value = sc.nextInt();
//            node.left = new Node(value);
//            populate(sc, node.left);
//        }
//
//        System.out.println(" enter left or right of "+node.val+" ? ........l/r");
//        String ch = sc.next();
//        if(Objects.equals(ch, "r")){
//            System.out.println("enter right node val");
//            int value = sc.nextInt();
//            node.right = new Node(value);
//            populate(sc, node.right);
//        }
//
//
//    }
//
//    public void display(){
//        display(root, 0);
//    }
//
//    public void display(Node node, int lvl){
//        if(node==null) return;
//
//        display(node.right, lvl + 1);
//        if(lvl!=0){
//            for(int i=0; i<lvl-1; i++){
//                System.out.print("|\t\t");
//            }
//            System.out.println("|----->" + node.val);
//        } else System.out.println(node.val);
//
//
//        display(node.left, lvl + 1);
//    }

    public  static void preOrder(){
        preOrder(root);
    }
    private static void preOrder(Node node){
        if(node==null) return ;

        System.out.print(node.val + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public  static void inOrder(){
        inOrder(root);
    }
    private static void inOrder(Node node){
        if(node==null) return;
        inOrder(node.left);
        System.out.print(node.val + " ");
        inOrder(node.right);

    }

    public static void postOrder(){
        postOrder(root);
    }
    private static void postOrder(Node node){
        if(node==null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.val + " ");

    }

    public static Node arr2tree(int arr[]){
        Node node = new Node(arr[0]);
        for (int i=1; i<arr.length; i++){
            add2tree(node, arr[i]);
        }
        return node;
    }

    private static void add2tree(Node node, int val){
        if(val<node.val){
            if(node.left==null) node.left = new Node(val);
            else add2tree(node.left, val);
        }
        else {
            if(node.right==null) node.right = new Node(val);
            else add2tree(node.right, val);
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,7,5,4,9,1};
        root = arr2tree(arr);
        inOrder();
        System.out.println();
        preOrder();
        System.out.println();
        postOrder();
    }
}
