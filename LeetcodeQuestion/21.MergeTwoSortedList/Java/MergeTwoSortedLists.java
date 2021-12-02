/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Merge two sorted linked lists and return it as a new sorted list. 
The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4

Data structure: List
 */
package mergetwosortedlists;

/**
 *
 * @author leonard
 */
public class MergeTwoSortedLists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListNode node3 = new ListNode(6);
        ListNode node2 = new ListNode(5, node3);
        ListNode node1 = new ListNode(4, node2);
        
        ListNode node23 = new ListNode(4);
        ListNode node22 = new ListNode(3, node23);
        ListNode node21 = new ListNode(1, node22);
        
        MergeTwoSortedLists sys = new MergeTwoSortedLists();
        ListNode node = sys.mergeTwoLists1(node1, node21);
        
        while(node != null){
            System.out.println(node.val);
            node = node.next;
        }
    }
    
    /**
     * recursive
     * @param l1
     * @param l2
     * @return 
     */
    public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null){
            return null;
        }
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        if(l1.val < l2.val){
            l1.next = mergeTwoLists1(l1.next, l2);
            return l1;
        }else{
            l2.next = mergeTwoLists1(l1, l2.next);
            return l2;
        }
    }
    
    /**
     * Iterative
     * @param l1
     * @param l2
     * @return 
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null){
            return null;
        }
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        
        ListNode head = new ListNode(0);
        ListNode temp = head;
        
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                temp.next = l1;
                l1 = l1.next;
            }else{
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        
        if(l1 == null){
            temp.next = l2;
        }else{
            temp.next = l1;
        }
        
        return head.next;
    }
}