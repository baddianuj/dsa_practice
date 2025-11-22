package TreesTutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TreeNode node = new TreeNode();
        Scanner sc = new Scanner(System.in);
        node.populate(sc);
        node.display();
        node.prettyDisplay();
    }




}
