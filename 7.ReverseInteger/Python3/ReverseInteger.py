"""
Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer
range: [−2**31,  2**31 − 1]. For the purpose of this problem, assume that your function returns 0 when
the reversed integer overflows.

Key Point: No ? ternary expression in Py.
           int is unbounded in py.
           sys.maxsize is 2 ** 63 - 1.
           Therefore, if we need a integer in (-2 ** 31, 2 ** 31 -1), we should use range.

           String split: from 2 to 4, str[2 : 5]. reverse: str[: : -1]
           reversed function in python for Str

           Python3: -1 % 10 == 9 Java: -1 % 10 = -1

###
"""
import sys


def reverse_integer(x):
    result = 0
    if x < 0:
        flag = True
        x = abs(x)

    while x != 0:
        result = result * 10 + x % 10
        x = int(x / 10)

    if flag:
        result = result * -1

    if result in range(-2 ** 31, 2 ** 31 - 1):
        return result
    else:
        return 0


def reverse_integer_slice(x):
    # result = str(abs(x))[::-1]
    result = ''.join(reversed(str(abs(x))))
    if x > 0:
        result = int(result)
    else:
        result = int(result) * -1
    if result in range(-2 ** 31, 2 ** 31 - 1):
        return result
    else:
        return 0

print(reverse_integer(-345))
