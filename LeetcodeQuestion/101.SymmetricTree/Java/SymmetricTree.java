/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
 

But the following [1,2,2,null,3,null,3] is not:

    1
   / \
  2   2
   \   \
   3    3

 */
package symmetrictree;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author leonard
 */
public class SymmetricTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SymmetricTree sys = new SymmetricTree();
        TreeNode C = new TreeNode(4);
        TreeNode B = new TreeNode(4);
        TreeNode A = new TreeNode(3, B, C);
        System.out.println(sys.isSymmetric2(A));
    }
    
    public boolean isSymmetric(TreeNode root) {
        return root == null ? false : isMirror(root.left, root.right);
    }
    
    public boolean isSymmetric2(TreeNode root) {
        if(root == null){
            return true;
        }
        Queue<TreeNode> myQueue = new LinkedList<>();
        myQueue.add(root.left);
        myQueue.add(root.right);
        while(!myQueue.isEmpty()){
            TreeNode temp1 = myQueue.poll();
            TreeNode temp2 = myQueue.poll();
            if(temp1 == null && temp2 == null){
                continue;
            }
            if(temp1 == null || temp2 == null){
                return false;
            }
            if(temp1.val != temp2.val){
                return false;
            }
            myQueue.add(temp1.left);
            myQueue.add(temp2.right);
            myQueue.add(temp1.right);
            myQueue.add(temp2.left);
        }
        return true;
    }
    
    private boolean isMirror(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return true;
        }
        if(left == null || right == null){
            return false;
        }
        if(left.val != right.val){
            return false;
        }
        return isMirror(left.left, right.right) && isMirror(left.right, right.left);
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
