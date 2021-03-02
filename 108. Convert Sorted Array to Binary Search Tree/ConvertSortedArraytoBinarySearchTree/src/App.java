public class App {
    public static void main(String[] args) throws Exception {
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

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return nums.length == 0 ? null : dfs(nums, 0, nums.length - 1);
    }

    public TreeNode dfs(int[] nums, int start, int end){
        if(start > end){
            return null;
        }
        if(start == end){
            return new TreeNode(nums[start]);
        }
        TreeNode root = new TreeNode(nums[(start + end)/2]);
        root.left = dfs(nums, start, (start + end)/2 - 1);
        root.right = dfs(nums, (start + end)/2 + 1, end);
        return root;
    }
}
