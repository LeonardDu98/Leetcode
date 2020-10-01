/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

For example:
Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
return its bottom-up level order traversal as:

[
  [15,7],
  [9,20],
  [3]
]
Key Point: reverse: Collection; Data structure: Queue.
 */
package binarytreelevelordertraversalii;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author leonard
 */
public class BinaryTreeLevelOrderTraversalII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BinaryTreeLevelOrderTraversalII sys = new BinaryTreeLevelOrderTraversalII();
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3, a, b);
        TreeNode d = new TreeNode(4, null, c);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(5, d, e);
        
        List<List<Integer>> result = sys.levelOrderBottom2(f);
        for(int i = 0; i < result.size(); i++){
            List<Integer> temp = result.get(i);
            for(int j = 0; j < temp.size(); j++){
                System.out.print(temp.get(j) + " ");
            }
            System.out.println("");
        }
    }
    
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int levelNumber = q.size();
            List<Integer> curr = new ArrayList<>();
            for(int i = 0; i < levelNumber; i++){
                TreeNode temp = q.poll();
                if(temp == null){
                    continue;
                }
                curr.add(temp.val);
                q.add(temp.left);
                q.add(temp.right);
            }
            
            if(curr.size() > 0){
                result.add(0, curr);
            }
        }
        //Collections.reverse(result);
        return result;       
    }
    
    public List<List<Integer>> levelOrderBottom2(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        support(root, result, 0);
        Collections.reverse(result);
        return result;
    }
    
    private void support(TreeNode node, List<List<Integer>> result, int level){
        if(node == null){
            return;
        }
        if(result.size() <= level){
            result.add(new ArrayList<>());
	}
        result.get(level).add(node.val);
        support(node.left, result, level + 1);
        support(node.right, result, level + 1);
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