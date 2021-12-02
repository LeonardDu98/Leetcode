"""
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.


Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
Example 4:

Input: s = "([)]"
Output: false
Example 5:

Input: s = "{[]}"
Output: true
"""


def is_valid(str):
    my_map = {"{": "}", "(": ")", "[": "]"}

    my_stack = []
    for i in str:
        if len(my_stack) == 0 or my_map.get(my_stack[-1]) != i:
            my_stack.append(i)
        else:
            my_stack.pop()
    return len(my_stack) == 0


print(is_valid("{}"))
