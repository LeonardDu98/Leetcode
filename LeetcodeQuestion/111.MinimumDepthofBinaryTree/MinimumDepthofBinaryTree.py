# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def minDepth(self, root: TreeNode) -> int:
        if root == None:
            return 0
        if root.left == None:
            return 1 + Solution.minDepth(self, root.right)
        if root.right == None:
            return 1 + Solution.minDepth(self, root.left)
        return 1 + min(Solution.minDepth(self,root.right), Solution.minDepth(self, root.left))