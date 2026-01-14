package TreesTutorial.BFS;
import java.util.*;
public class BFSLC993 {
    public boolean isCousins(BFS.Node root, int x, int y) {
        Queue<BFS.Node> queue = new LinkedList<>();
        if (root == null) return false;
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean fx = false;
            boolean fy = false;
            for (int i = 0; i < size; i++) {
                BFS.Node curr = queue.poll();

                if (curr.left != null && curr.right != null) {
                    if ((curr.left.val == x && curr.right.val == y) || curr.left.val == y && curr.right.val == x)
                        return false;
                }

                if (curr.left != null) queue.offer(curr.left);
                if (curr.right != null) queue.offer(curr.right);

                if (curr.val == x) fx = true;
                if (curr.val == y) fy = true;
            }

            if (fx ^ fy) return false;

            if (fx && fy) return true;
        }
        return false;
    }
}
