package dsImplementation;

public class Node {
    private Node left;
    private Node right;
    private final int val;

    public Node(int val){
        this.val = val;
    }

    public Node getLeft(){
        return left;
    }

    public void setLeft(Node left){
        this.left = left;
    }

    public Node getRight(){
        return right;
    }

    public void setRight(Node right){
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


    
