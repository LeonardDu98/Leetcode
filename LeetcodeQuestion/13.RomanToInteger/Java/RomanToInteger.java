/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.

Example 1:

Input: "III"
Output: 3
Example 2:

Input: "IV"
Output: 4
Example 3:

Input: "IX"
Output: 9
Example 4:

Input: "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 5:

Input: "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

Key Point: Binary Search need a sorted Array.
 */
package romantointeger;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author leonard
 */
public class RomanToInteger {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RomanToInteger sys = new RomanToInteger();
        System.out.println(sys.romanToIntegerMap("MCMXCIV"));
        //System.out.println(Arrays.binarySearch(ROMAN, 'D'));
    }
    
    public int romanToInteger(String s){
        final int[] INTEGER = {100, 500, 1, 50, 1000, 5, 10};
        final char[] ROMAN = {'C', 'D', 'I', 'L', 'M', 'V', 'X'};//binarySearch need a sorted array.
        int result = 0;
        for(int i = 0; i < s.length() - 1; i++){
            int now = INTEGER[Arrays.binarySearch(ROMAN, s.charAt(i))];
            int next = INTEGER[Arrays.binarySearch(ROMAN, s.charAt(i + 1))];
            if(now < next){
                result -= now;
                continue;
            }
            result += now;
        }
        result += INTEGER[Arrays.binarySearch(ROMAN, s.charAt(s.length() - 1))];
        return result;
    }
    
    public int romanToIntegerMap(String s){
        final int[] INTEGER = {1, 5, 10, 50, 100, 500, 1000};
        final char[] ROMAN = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < ROMAN.length; i++){
            map.put(ROMAN[i], INTEGER[i]);
        }
        
        int result = 0;
        for(int i = 0; i < s.length() - 1; i++){
            int targetNumber = map.get(s.charAt(i));
            if(targetNumber < map.get(s.charAt(i + 1))){
                result -= targetNumber;
                continue;
            }
            result += targetNumber;
        }
        
        result += map.get(s.charAt(s.length() - 1));
        return result;
    }
}
