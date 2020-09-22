/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validparentheses;

import java.util.HashMap;
import java.util.Stack;

/**
 *
 * @author leonard
 */
public class ValidParentheses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ValidParentheses sys = new ValidParentheses();
        System.out.println(sys.isValid("[{]}"));
    }
    
    public boolean isValid(String s) {
        Stack<Character> myStack = new Stack<>();
        HashMap<Character, Character> myMap = new HashMap<>();
        myMap.put('{', '}');
        myMap.put('(', ')');
        myMap.put('[', ']');
        for(int i = 0; i < s.length(); i++){
            if(myStack.isEmpty()){
                myStack.push(s.charAt(i));
            }else{
                char top = myStack.peek();
                if(myMap.get(top) != null && myMap.get(top) == (s.charAt(i))){
                    myStack.pop();
                }else{
                    myStack.push(s.charAt(i));
                }
            }
        }
        
        return myStack.isEmpty();
    }
}
