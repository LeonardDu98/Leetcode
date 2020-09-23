"""
Merge two sorted linked lists and return it as a new sorted list.
The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4
"""


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


# Iterative
def merge_two_lists(l1: ListNode, l2: ListNode) -> ListNode:
    if l1 is None or l2 is None:
        return l1 or l2

    head = temp = ListNode(0)

    while l1 is not None and l2 is not None:
        if l1.val < l2.val:
            temp.next = l1
            l1 = l1.next
        else:
            temp.next = l2
            l2 = l2.next
        temp = temp.next

    temp.next = l1 or l2

    return head.next


# Recursive
def merge_two_lists2(l1: ListNode, l2: ListNode) -> ListNode:
    if not l1 or not l2:
        return l1 or l2

    if l1.val < l2.val:
        l1.next = merge_two_lists2(l1.next, l2)
        return l1
    else:
        l2.next = merge_two_lists2(l1, l2.next)
        return l2


node13 = ListNode(5)
node12 = ListNode(3, node13)
node11 = ListNode(0, node12)

node23 = ListNode(4)
node22 = ListNode(2, node23)
node21 = ListNode(1, node22)

node = merge_two_lists2(node11, node21)
while node is not None:
    print(node.val)
    node = node.next
