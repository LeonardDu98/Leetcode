public class BalancedBinaryTree {

    public static void main(String[] args) {
	// write your code here
    }

    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        if(Math.abs(height(root.left) - height(root.right)) <= 1){
            return isBalanced(root.left) && isBalanced(root.right);
        }else{
            return false;
        }
    }

    public int height(TreeNode node){
        if(node == null){
            return -1;
        }else{
            return Math.max(height(node.left), height(node.right)) + 1;
        }
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}