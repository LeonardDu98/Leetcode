"""
Given a binary tree, return the bottom-up level order traversal of its nodes' values.
 (ie, from left to right, level by level from leaf to root).

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

"""


class TreeNode:
     def __init__(self, val=0, left=None, right=None):
         self.val = val
         self.left = left
         self.right = right


import queue


class Solution:
    def level_order_bottom(self, root: TreeNode) -> list:
        result = []
        if not root:
            return result
        my_queue = queue.Queue()

        my_queue.put(root)
        while not my_queue.empty():
            temp = []
            for i in range(my_queue.qsize()):
                node = my_queue.get()
                temp.append(node.val)
                if node.left:
                    my_queue.put(node.left)
                if node.right:
                    my_queue.put(node.right)
            if len(temp) != 0:
                result.append(temp)
        result.reverse()
        return result
    

if __name__ == '__main__':
    a = TreeNode(1)
    b = TreeNode(2)
    c = TreeNode(3, a, b)
    d = TreeNode(4, None, c)
    e = TreeNode(5)
    f = TreeNode(6, d, e)

    sys = Solution()
    result = sys.level_order_bottom(f)
    print(result)

