/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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

Key Point: using int, the upper bound is a big problem. 
           we have to use String in loop in java.
           However, java.Marh.BigInteger likes int in python which don't have upperbound.
           BigInteger(String, int). String is the number, int is binary or decimal or others.
           BigInteger.toString(int). int is binary or decimal or others.
 */
package addbinary;

/**
 *
 * @author leonard
 */
public class AddBinary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AddBinary sys = new AddBinary();
        System.out.println(sys.addBinary("11", "1"));
    }
    
    public String addBinary(String a, String b) {
        int indexa = a.length() - 1;
        int indexb = b.length() - 1;
        
        String result = "";
        int up = 0;
        while(indexa >= 0 || indexb >= 0){
            int sum = 0;
            if(indexa >= 0){
                sum += a.charAt(indexa) - '0';
                indexa--;
            }
            if(indexb >= 0){
                sum += b.charAt(indexb) - '0';
                indexb--;
            }
            sum += up;
            result = sum % 2 + result;
            up = sum / 2;
        }
        if(up > 0){
            result = up + result;
        }
        return result;
    }
    
    public String addBinary2(String a, String b) {
        java.math.BigInteger a1 = new java.math.BigInteger(a,2);
        java.math.BigInteger b1 = new java.math.BigInteger(b,2);
        
        return a1.add(b1).toString(2);
    }
}
