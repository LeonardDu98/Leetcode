"""
Implement int sqrt(int x).

Compute and return the square root of x, where x is guaranteed to be a non-negative integer.

Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.

Example 1:

Input: 4
Output: 2
Example 2:

Input: 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since
             the decimal part is truncated, 2 is returned.

Key point: sqrt method in py3, the input must not less than 0
"""


import math


def my_sqrt(x: int) -> int:
    if x < 1:
        return 0
    else:
        return int(math.sqrt(x))


def my_sqrt2(x: int) -> int:
    if x < 1:
        return 0

    start = 1
    end = x

    while start < end - 1:
        mid = int((start + end) / 2)
        if mid * mid == x:
            return mid
        if mid * mid > x:
            end = mid
        else:
            start = mid
    return start


print(my_sqrt(-1))
print(my_sqrt(0))
print(my_sqrt(1))
print(my_sqrt(76))
print("----------")
print(my_sqrt2(-1))
print(my_sqrt2(0))
print(my_sqrt2(1))
print(my_sqrt2(76))
