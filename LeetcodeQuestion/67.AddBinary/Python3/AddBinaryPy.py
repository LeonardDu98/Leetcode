"""
Given two binary strings, return their sum (also a binary string).

The input strings are both non-empty and contains only characters 1 or 0.

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"


Constraints:

Each string consists only of '0' or '1' characters.
1 <= a.length, b.length <= 10^4
Each string is either "0" or doesn't contain any leading zero.

key point: bin and int in py
           bin(num) convert an int to bin
           int(num, 2/4/8/16) convert bin or others to int
           str(bin) = "Ob + real number"
"""


def add_binary(a: str, b: str) -> str:
    return str(bin(int(a, 2) + int(b, 2)))[2:]


def add_binary2(a: str, b: str) -> str:
    indexa = len(a) - 1
    indexb = len(b) - 1

    result = ""
    up = 0
    while indexa >= 0 or indexb >= 0:
        sum = 0
        if indexa >= 0:
            sum = sum + int(a[indexa])
            indexa = indexa - 1
        if indexb >= 0:
            sum = sum + int(b[indexb])
            indexb = indexb -1
        sum = sum + up
        result = str(sum % 2) + result
        up = int(sum / 2)
    if up > 0:
        result = "1" + result
    return result


print(add_binary2("11", "1"))
