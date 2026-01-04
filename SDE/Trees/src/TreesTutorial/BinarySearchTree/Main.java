package TreesTutorial.BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        BST tree = new BST();
        for(int i=1; i<=1000; i++){
            tree.insert(i);
        }
        System.out.println(tree.height());
    }
}
