"""
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

Key Point: startswith function and sorted function.
"""


def longest_common_prefix(strs):
    if len(strs) == 0:
        return ""
    result = strs[0]
    for i in range(1, len(strs)):
        while result != strs[i][0: len(result)]:
            result = result[0: -1]

    return result


def longest_common_prefix2(strs):
    if len(strs) == 0 or strs is None:
        return ""
    result = ""
    for i in range(len(strs[0])):
        for j in range(1, len(strs)):
            if len(strs[j]) - 1 < i or strs[0][i] != strs[j][i]:
                return result
        result += strs[0][i]

    return result


def longest_common_prefix3(strs):
    if len(strs) == 0 or strs is None:
        return ""
    strs = sorted(strs)
    result = ""
    for i in strs[0]:
        if strs[-1].startswith(result + i):
            result += i
        else:
            break
    return result


string = ["aa", "a"]
print(longest_common_prefix3(string))
