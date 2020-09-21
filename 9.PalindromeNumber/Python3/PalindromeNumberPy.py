"""
Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

Example 1:

Input: 121
Output: true
Example 2:

Input: -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
Follow up:

Coud you solve it without converting the integer to a string?

Key Point: string slide[::-1]
           in Py3, -1 % 10 = 9. Therefore, we need to judge the relationship of x and 0 in advance.
"""


def convert_string(x):
    return str(x) == str(x)[::-1]


def not_convert_string(x):
    if x < 0:
        return False

    original = x
    reverse = 0
    while x != 0:
        reverse = reverse * 10 + x % 10
        x = int(x / 10)
    return reverse == original


print(not_convert_string(-121))
