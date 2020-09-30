"""
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
"""


class TreeNode:
     def __init__(self, val=0, left=None, right=None):
         self.val = val
         self.left = left
         self.right = right


def ismirror(left: TreeNode, right: TreeNode) -> bool:
    if left is None and right is None:
        return True
    if left is None or right is None:
        return False
    if left.val != right.val:
        return False
    return ismirror(left.left, right.right) and ismirror(left.right, right.left)


def is_symmetric(root: TreeNode) -> bool:
    if not root:
        return True
    return ismirror(root.left, root.right)


def is_symmetric2(root: TreeNode) -> bool:
    if not root:
        return True

    myQueue = []
    myQueue.append(root.left)
    myQueue.append(root.right)

    while len(myQueue) != 0:
        temp1 = myQueue.pop()
        temp2 = myQueue.pop()
        if not temp1 and not temp2:
            continue
        if not temp1 or not temp2:
            return False
        if temp1.val != temp2.val:
            return False
        myQueue.append(temp1.left)
        myQueue.append(temp2.right)
        myQueue.append(temp1.right)
        myQueue.append(temp2.left)
    return True


