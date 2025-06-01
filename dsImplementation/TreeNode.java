package dsImplementation;

public class TreeNode {
    private TreeNode left;
    private TreeNode right;
    private final int val;

    public TreeNode(int val){
        this.val = val;
    }

    public TreeNode getLeft(){
        return left;
    }

    public void setLeft(TreeNode left){
        this.left = left;
    }

    public TreeNode getRight(){
        return right;
    }

    public void setRight(TreeNode right){
        this.right = right;
    }

    public int getVal(){
        return val;
    }

    @Override
    public String toString(){
        return String.valueOf(val);        
    }
}


    
