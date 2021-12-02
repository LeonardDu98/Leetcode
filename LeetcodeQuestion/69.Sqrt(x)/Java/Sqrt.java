/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Implement int sqrt(int x).

Compute and return the square root of x, where x is guaranteed to be a non-negative integer.

Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.

Example 1:

Input: 4
Output: 2
Example 2:

Input: 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since 
             the decimal part is truncated, 2 is returned.
 */
package sqrt;

/**
 *
 * @author leonard
 */
public class Sqrt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sqrt sys = new Sqrt();
        System.out.println(sys.mySqrt(2147395599));
        System.out.println(sys.mySqrt(10));
        System.out.println(sys.mySqrt(30));
        System.out.println(sys.mySqrt(45));
        System.out.println(sys.mySqrt(134));
        System.out.println(sys.mySqrt(1));
        System.out.println(sys.mySqrt(0));
        System.out.println(sys.mySqrt(-1));
        System.out.println("-------------------");
        System.out.println(sys.mySqrt2(2147395599));
        System.out.println(sys.mySqrt2(10));
        System.out.println(sys.mySqrt2(30));
        System.out.println(sys.mySqrt2(45));
        System.out.println(sys.mySqrt2(134));
        System.out.println(sys.mySqrt2(1));
        System.out.println(sys.mySqrt2(0));
        System.out.println(sys.mySqrt2(-1));
    }
    
    public int mySqrt(int x){
        return (int)Math.sqrt(x);
    }
    
    public int mySqrt2(int x){
        
        if(x <= 0){
            return 0;
        }
        int start = 1;
        int end = x;
        while(start < end - 1){
            long mid = (end + start) / 2;
            if(mid * mid == x){
                return (int)mid;
            }
            if(mid * mid > x){
                end = (int)mid;
            }else{
                start = (int)mid;
            }
            
        }
        return start;
    }
}
