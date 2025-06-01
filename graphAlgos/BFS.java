package graphAlgos;

import dsImplementation.TreeNode;
import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;

public class BFS {

    public String solveTreeBFS(TreeNode root){
        ArrayList<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if(root == null){
            return "[]";
        }

        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode curr = queue.poll();
            result.add(curr.getVal());
            
            if(curr.getLeft() != null){
                queue.add(curr.getLeft());
            }

            if(curr.getRight() != null){
                queue.add(curr.getRight());
            }
        }

        return result.toString();
    }
}
