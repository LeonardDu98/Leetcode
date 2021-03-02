class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def sortedArrayToBST(self, nums):
    if len(nums) == 0:
        return None
    else:
        return dfs(nums, 0, len(nums) - 1)
    
def dfs(nums, start, end):
    if start > end:
        return None
    if start == end:
        return TreeNode(nums[start])
    left = dfs(nums, start, int((start + end)/2) - 1)
    right = dfs(nums, int((start + end)/2) + 1, end)
    return TreeNode(nums[int((start + end)/2)], left, right)
