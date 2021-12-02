/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word (last word means the last appearing word if we loop from left to right) in the string.

If the last word does not exist, return 0.

Note: A word is defined as a maximal substring consisting of non-space characters only.

Example:

Input: "Hello World"
Output: 5

Key Point: split method in java doesn't have default method.
 */
package lengthoflastword;

/**
 *
 * @author leonard
 */
public class LengthofLastWord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LengthofLastWord sys = new LengthofLastWord();
        String s = "Hello ";
        System.out.println(sys.lengthOfLastWord(s));
    }
    
    public int lengthOfLastWord(String s) {
        String[] subStrings = s.split(" ");
        return subStrings[subStrings.length - 1].length();
    }
}
