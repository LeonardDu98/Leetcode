"""
Given a sorted linked list, delete all duplicates such that each element appear only once.

Example 1:

Input: 1->1->2
Output: 1->2
Example 2:

Input: 1->1->2->3->3
Output: 1->2->3
"""

class ListNode:
     def __init__(self, val=0, next = None):
         self.val = val
         self.next = next


def delete_duplicates(head: ListNode) -> ListNode:
    result = temp = ListNode(0)

    while head is not None:
        if head.next is None or head.next.val != head.val:
            temp.next = head
            temp = temp.next
        head = head.next

    return result.next


node6 = ListNode(4)
node5 = ListNode(3, node6)
node4 = ListNode(3, node5)
node3 = ListNode(2, node4)
node2 = ListNode(1, node3)
node1 = ListNode(1, node2)

node = delete_duplicates(None)
while node is not None:
    print(node.val)
    node = node.next
