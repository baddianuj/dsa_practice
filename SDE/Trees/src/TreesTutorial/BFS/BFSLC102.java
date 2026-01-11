package TreesTutorial.BFS;
import java.util.*;
public class BFSLC102 {
    public class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val=val;
        }

        Node(int val, Node left, Node right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }

    public class customQueue{
        Node[] arr = new Node[200000];
        int start=0;
        int end=0;

        void offer(Node node){
            arr[end++] = node;
        }
        Node poll(){
            return arr[start++];
        }
        int size(){
            return end-start;
        }
    }

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        customQueue queue = new customQueue();
        if(root==null) return ans;
        queue.offer(root);

        while(queue.size()>0){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0; i<size; i++){
                Node curr = queue.poll();
                list.add(curr.val);
                if(curr.left!=null) queue.offer(curr.left);
                if(curr.right!=null) queue.offer(curr.right);
            }
            ans.add(list);
        }
        return ans;
    }
}
