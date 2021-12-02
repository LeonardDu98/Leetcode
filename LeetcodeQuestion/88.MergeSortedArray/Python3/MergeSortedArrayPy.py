"""
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:

The number of elements initialized in nums1 and nums2 are m and n respectively.
You may assume that nums1 has enough space (size that is equal to m + n) to hold additional elements from nums2.
Example:

Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

Output: [1,2,2,3,5,6]
"""


def merge(nums1: list, m: int, nums2: list, n: int) -> None:
    i = m - 1
    j = n - 1
    length = m + n - 1

    while j >= 0:
        if i >= 0 and nums1[i] > nums2[j]:
            nums1[length] = nums1[i]

            i = i - 1
        else:
            nums1[length] = nums2[j]
            j = j - 1
        length = length - 1


def merge2(nums1: list, m: int, nums2: list, n: int) -> None:
    nums1[m::] = nums2[0: n]
    nums1.sort()


nums_1 = [1,2,3,0,0,0]
nums_2 = [2,5,6]

merge2(nums_1, 3, nums_2, 3)

for i in range(len(nums_1)):
    print(nums_1[i])
