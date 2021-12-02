/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could only store integers within the 32-bit signed 
integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns
0 when the reversed integer overflows.

Key Point: negative number % 10. For example: -1 % 10 = -1
 */
package reverseinteger;

/**
 *
 * @author leonard
 */
public class ReverseInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ReverseInteger sys = new ReverseInteger();
        System.out.println(sys.ReverseInteger(-1238656576));
        System.out.println(-1 % 10);
    }
    
    public int ReverseInteger(int x){
        long result = 0;
        
        while(x != 0){
            result = result * 10 + x % 10;
            x = x / 10;
        }
        
        return result > Integer.MAX_VALUE || result < Integer.MIN_VALUE ? 0 : (int)result;
    }
}
