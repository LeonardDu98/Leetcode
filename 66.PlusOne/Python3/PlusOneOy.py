"""
Given a non-empty array of digits representing a non-negative integer, increment one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.



Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Example 3:

Input: digits = [0]
Output: [1]

key Point: in Py3, the int is infinity.
"""


def plus_one(num: list) -> list:
    i = len(num) - 1
    while i >= 0:
        if num[i] == 9:
            num[i] = 0
            i = i - 1
        else:
            num[i] = num[i] + 1
            break

    if num[0] == 0:
        num = [1] + num
    return num


def plus_one2(num: list) -> list:
    result = 0
    for i in range(len(num)):
        result = result * 10 + num[i]
    result = str(result + 1)
    my_list = []
    for i in range(len(result)):
        my_list.append(int(result[i]))
    return my_list


digits = [9, 9, 9]
print(plus_one2(digits))
