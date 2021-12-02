"""
You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Example 1:

Input: 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
"""


def climb_stairs(n: int) -> int:
    if n == 1 or n == 2:
        return n
    return climb_stairs(n - 1) + climb_stairs(n - 2)


def climb_stairs2(n: int) -> int:
    if n == 1 or n == 2:
        return n
    x = 1
    y = 2
    i = 3
    result = 0
    while i <= n:
        result = x + y
        x = y
        y = result
        i = i + 1
    return result


print(climb_stairs2(45))
