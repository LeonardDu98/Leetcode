"""
Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2
Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1
Clarification:

What should we return when needle is an empty string? This is a great question to ask during an interview.

For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().

Key Point: java subString == slide in py; split is using to split string to String[] with the given stop string like "\n", "\r"
"""


def str_str(haystack: str, needle: str) -> int:
    return haystack.find(needle)


def str_str2(haystack: str, needle: str) -> int:
    if len(needle) == 0:
        return 0
    for i in range(len(haystack) - len(needle) + 1):
        if haystack[i: i + len(needle)] == needle:
            return i

    return -1


print(str_str2("abcd", "bc"))
