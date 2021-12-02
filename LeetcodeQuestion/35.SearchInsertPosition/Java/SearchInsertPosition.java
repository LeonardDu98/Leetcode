/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Given a sorted array and a target value, return the index if the target is found.
If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Example 1:

Input: [1,3,5,6], 5
Output: 2
Example 2:

Input: [1,3,5,6], 2
Output: 1
Example 3:

Input: [1,3,5,6], 7
Output: 4
Example 4:

Input: [1,3,5,6], 0
Output: 0

key point: how to implement binary Search.
 */
package searchinsertposition;

/**
 *
 * @author leonard
 */
public class SearchInsertPosition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SearchInsertPosition sys = new SearchInsertPosition();
        int[] nums = {0, 1, 3};
        System.out.println(sys.searchInsert2(nums, 0));
        System.out.println(sys.searchInsert2(nums, 1));
        System.out.println(sys.searchInsert2(nums, 2));
        System.out.println(sys.searchInsert2(nums, 3));
        System.out.println(sys.searchInsert2(nums, 4));
    }
    
    public int searchInsert(int[] nums, int target) {
        if(nums == null){
            return 0;
        }
        for(int i = 0; i < nums.length; i++){
            if(target <= nums[i]){
                return i;
            }
        }
        return nums.length;
    }
    
    public int searchInsert2(int[] nums, int target){
        return binarySearch(nums, target, 0, nums.length - 1);
    }
    
    private int binarySearch(int[] nums, int target, int left, int right){
        if(left > right){
            return left;
        }
        int mid = (left + right) / 2;
        if(nums[mid] == target){
            return mid;
        }
        return nums[mid] > target ? binarySearch(nums, target, left, mid - 1) : binarySearch(nums, target, mid + 1, right);
    }
}
