/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.


 */
package longestcommonprefix;

/**
 *
 * @author leonard
 */
public class LongestCommonPrefix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LongestCommonPrefix sys = new LongestCommonPrefix();
        String[] test = {"abcde", "abcd"};
        System.out.println(sys.longestCommonPrefix2(test));
    }
    
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        if(strs.length == 0){
            return result;
        }else{
            result = strs[0];
            for(int i = 1; i < strs.length; i++){
                while(strs[i].indexOf(result) != 0 && result.length() > 0){
                    result = result.substring(0, result.length() - 1);
                }
            }
        }
        return result;
    }
    
    public String longestCommonPrefix2(String[] strs) {
        String result = "";
        if(strs.length == 0) return result;
        
        for(int i = 0; i < strs[0].length(); i++){
            for(int j = 1; j < strs.length; j++){
                if(strs[j].length() - 1< i || strs[0].charAt(i) != strs[j].charAt(i)){
                    return result;
                }
            }
            result += strs[0].charAt(i);
        }
        
        return result;
    }
    
}
