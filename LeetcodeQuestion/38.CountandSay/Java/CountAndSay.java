/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
The count-and-say sequence is the sequence of integers with the first five terms as following:

1.     1
2.     11
3.     21
4.     1211
5.     111221
1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.

Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-say sequence.
You can do so recursively, in other words from the previous member read off the digits,
counting the number of digits in groups of the same digit.

Note: Each term of the sequence of integers will be represented as a string.

 

Example 1:

Input: 1
Output: "1"
Explanation: This is the base case.
Example 2:

Input: 4
Output: "1211"
Explanation: For n = 3 the term was "21" in which we have two groups "2" and "1",
"2" can be read as "12" which means frequency = 1 and value = 2, the same way "1"
is read as "11", so the answer is the concatenation of "12" and "11" which is "1211".
 */
package countandsay;

/**
 *
 * @author leonard
 */
public class CountAndSay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CountAndSay sys = new CountAndSay();
        System.out.println(sys.countAndSay(1));
        System.out.println(sys.countAndSay(2));
        System.out.println(sys.countAndSay(3));
        System.out.println(sys.countAndSay(4));
        System.out.println(sys.countAndSay(5));
    }
    
    public String countAndSay(int n){
        if(n == 1){
            return "1";
        }
        
        String s = countAndSay(n - 1);
        
        int same = 1;
        String result = "";
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i - 1)){
                same++;
            }else{
                result += same;
                result += s.charAt(i - 1);
                same = 1;
            }
        }
        result += same;
        result += s.charAt(s.length() - 1);
        return result;
    }
    
}
