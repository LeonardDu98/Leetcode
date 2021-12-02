# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right


class Solution:
    def isBalanced(self, root: TreeNode) -> bool:
        if root == None:
            return True
        
        if abs(height(root.left) - height(root.right)) <= 1:
            return Solution.isBalanced(self, root.left) & Solution.isBalanced(self, root.right)
        else:
            return False
    
def height(root):
    if root == None:
        return -1;
    if root.left == None and root.right is None:
        return 0
    else:
        return max(height(root.left), height(root.right)) + 1