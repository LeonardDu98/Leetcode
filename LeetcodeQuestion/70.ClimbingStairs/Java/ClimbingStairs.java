/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Example 1:

Input: 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step

key Point: recursion results time error!!!. Recursion(2^n) need really more time than loop(O(n)).
 */
package climbingstairs;

/**
 *
 * @author leonard
 */
public class ClimbingStairs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClimbingStairs sys = new ClimbingStairs();
        System.out.println(sys.climbStairs2(0));
        System.out.println(sys.climbStairs2(1));
        System.out.println(sys.climbStairs2(2));
        System.out.println(sys.climbStairs2(45));
    }
    
    public int climbStairs(int n) {
        if(n <= 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return n;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
    
    public int climbStairs2(int n) {
        if(n == 1 || n == 2){
            return n;
        }
        int x = 1;
        int y = 2;
        int result = 0;
        for(int i = 3; i <= n; i++){
            result = x + y;
            x = y;
            y = result;
        }
        return result;
    }
}
