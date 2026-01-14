package TreesTutorial.BFS;
import java.util.*;
public class BFSLC199 {
    public List<Integer> rightSideView(BFS.Node root) {
        List<Integer> ans = new ArrayList<>();
        Queue<BFS.Node> queue = new LinkedList<>();
        if(root==null) return ans;

        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            // BFS.Node arr[] = new BFS.Node[size]; no need of this
            BFS.Node curr = null;
            for(int i=0; i<size; i++){
                curr = queue.poll();
                // arr[i] = curr; no need
                if(curr.left!=null) queue.offer(curr.left);
                if(curr.right!=null) queue.offer(curr.right);
            }
            // ans.add(arr[size-1].val); // instead of complete array, just the last elemetnt better approach.
            ans.add(curr.val);
        }
        return ans;
    }
}
