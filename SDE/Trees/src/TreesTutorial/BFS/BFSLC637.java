package TreesTutorial.BFS;
import TreesTutorial.TreeNode;
import TreesTutorial.practice.Tree;

import java.util.*;
public class BFSLC637 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val=val;
        }
    }

    public TreeNode root;

    public List<Double> averageofLevels(TreeNode root){
        List<Double> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root==null) return ans;

        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();
//            List<Double> list= new ArrayList<>();
            double avg = 0;
            for(int i=0; i<size; i++){
                TreeNode curr = queue.poll();
                avg+=curr.val;
//                list.add((double) curr.val);
                if (curr.left!=null) queue.offer(curr.left);
                if (curr.right!=null) queue.offer(curr.right);
//                avg+=list.get(i);
            }
            ans.add(avg/size);
        }
        return ans;
    }
}
