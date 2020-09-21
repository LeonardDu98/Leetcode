/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromenumber;

/**
 *
 * @author leonard
 */
public class PalindromeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PalindromeNumber sys = new PalindromeNumber();
        System.out.println(sys.notConvertString(-111));
    }
    
    public boolean convertString(int x){
        StringBuilder input = new StringBuilder();
        input.append(Integer.toString(x));        
        return Integer.toString(x).equals(input.reverse().toString());
    }
    
    public boolean notConvertString(int x){
        int reverse = 0;
        int original = x;
        while(x != 0){
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }
        return original > 0 && original == reverse;
    }
}
