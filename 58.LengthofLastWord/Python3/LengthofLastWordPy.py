"""
Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word (last word means the last appearing word if we loop from left to right) in the string.

If the last word does not exist, return 0.

Note: A word is defined as a maximal substring consisting of non-space characters only.

Example:

Input: "Hello World"
Output: 5

key point: in python, String split method. the default split is not same as " " split.
For example:
string = "Hello, "
string.split() = ['Hello,']
string.split(" ") = ['Hello,', '']

"""


def length_of_last_word(s: str) -> int:
    sub_string = s.split()
    if len(sub_string) == 0:
        return 0
    else:
        return len(sub_string[-1])


string = "Hello, hkh"
print(length_of_last_word(string))
