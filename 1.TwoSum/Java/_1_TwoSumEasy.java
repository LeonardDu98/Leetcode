/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _1_twosumeasy;

import java.util.HashMap;

/**
 *
 * @author leonard
 */
public class _1_TwoSumEasy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] nums = {2,7,11,15};
        var targer = 13;
        
        _1_TwoSumEasy sys = new _1_TwoSumEasy();
        int[] result = sys.TwoSumHash1(nums, targer);
        System.out.println(result[0] + " " + result[1]);
    }

    public int[] TwoSum(int[] a, int target){
        int[] result = new int[2];
        
        for(int i = 0; i < a.length - 1; i++){
            for(int j = i + 1; j < a.length; j++){
                if(a[i] + a[j] == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        
        return result;
    }
    
    public int[] TwoSumHash1(int[] a, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < a.length; i++){
            map.put(a[i], i);
        }
        
        for(int i = 0; i < a.length; i++){
            int complement = target - a[i];
            if(map.containsKey(complement) && map.get(complement) != i){
                return new int[] {i, map.get(complement)};
            }
        }
        
        throw new IllegalArgumentException("No result");
    }
            
    public int[] TwoSumHash2(int[] a, int target){
        for(int i = 0; i < a.length; i++){
            int complement = target - a[i];
            HashMap<Integer, Integer> map = new HashMap<>();
            if(map.containsKey(complement) && map.get(complement) != i){
                return new int[] {map.get(complement), i};
            }
            map.put(a[i], i);
        }
        
        throw new IllegalArgumentException("No result");
    }
}
