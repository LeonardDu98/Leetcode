/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Given two binary trees, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical and the nodes have the same value.

Example 1:

Input:     1         1
          / \       / \
         2   3     2   3

        [1,2,3],   [1,2,3]

Output: true
Example 2:

Input:     1         1
          /           \
         2             2

        [1,2],     [1,null,2]

Output: false
Example 3:

Input:     1         1
          / \       / \
         2   1     1   2

        [1,2,1],   [1,1,2]

Output: false
 */

package sametree;

/**
 *
 * @author leonard
 */
public class SameTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SameTree sys = new SameTree();
        TreeNode C = new TreeNode(5);
        TreeNode B = new TreeNode(4);
        TreeNode A = new TreeNode(3, B, C);
        
        TreeNode c = new TreeNode(5);
        TreeNode b = new TreeNode(4);
        TreeNode a = new TreeNode(3, b, c);
        System.out.println(sys.isSameTree(a, A));
    }
    
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null ^ q == null){
            return false;
        }
        if(p == q){// null == null
            return true;
        }
        if(p.val != q.val){
            return false;
        }else{
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
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