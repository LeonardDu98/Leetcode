"""
Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Example 1:

Input: [1,3,5,6], 5
Output: 2
Example 2:

Input: [1,3,5,6], 2
Output: 1
Example 3:

Input: [1,3,5,6], 7
Output: 4
Example 4:

Input: [1,3,5,6], 0
Output: 0

key Point: binary search
"""


def search_insert(nums: list, target: int) -> int:
    if nums is None:
        return 0
    for i in range(len(nums)):
        if target <= nums[i]:
            return i

    return len(nums)


def search_insert_binary(nums: list, target: int) -> int:
    return binary_search(nums, target, 0, len(nums) - 1)


def binary_search(nums: list, target: int, left: int, right: int) -> int:
    if left > right:
        return left
    mid = (left + right) // 2
    if target == nums[mid]:
        return mid
    if nums[mid] < target:
        return binary_search(nums, target, mid + 1, right)
    else:
        return binary_search(nums, target, left, mid - 1)


my_list = [0, 1, 3]
print(search_insert_binary(my_list, 0))
print(search_insert_binary(my_list, 1))
print(search_insert_binary(my_list, 2))
print(search_insert_binary(my_list, 3))
print(search_insert_binary(my_list, 4))
