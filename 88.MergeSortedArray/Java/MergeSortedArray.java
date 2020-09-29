/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:

The number of elements initialized in nums1 and nums2 are m and n respectively.
You may assume that nums1 has enough space (size that is equal to m + n) to hold additional elements from nums2.
Example:

Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

Output: [1,2,2,3,5,6]
 */
package mergesortedarray;

import java.util.Arrays;

/**
 *
 * @author leonard
 */
public class MergeSortedArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MergeSortedArray sys = new MergeSortedArray();
        int[] nums1 = {1, 3, 5, 6, 8, 0, 0, 0};
        int[] nums2 = {2, 3, 4};
        sys.merge2(nums1, 5, nums2, 3);
        for(int i: nums1){
            System.out.println(i);
        }
    }
    
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }
    
    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int index = m + n - 1;
        
        while(j >= 0){
            if(i >= 0 && nums1[i] > nums2[j]){
                nums1[index] = nums1[i];
                i--;
            }else{
                nums1[index] = nums2[j];
                j--;
            }
            index--;
        }
    }
}
