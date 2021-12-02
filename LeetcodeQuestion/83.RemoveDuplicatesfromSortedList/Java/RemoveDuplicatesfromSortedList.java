/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Given a sorted linked list, delete all duplicates such that each element appear only once.

Example 1:

Input: 1->1->2
Output: 1->2
Example 2:

Input: 1->1->2->3->3
Output: 1->2->3
 */
package removeduplicatesfromsortedlist;

/**
 *
 * @author leonard
 */
public class RemoveDuplicatesfromSortedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RemoveDuplicatesfromSortedList sys = new RemoveDuplicatesfromSortedList();
        ListNode node6 = new ListNode(4);
        ListNode node5 = new ListNode(4, node6);
        ListNode node4 = new ListNode(3, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        
        ListNode node = sys.deleteDuplicates(node1);
        while(node != null){
            System.out.println(node.val);
            node = node.next;
        }
    }
    
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode result = new ListNode(0);
        ListNode temp = result;
        
        while(head != null){
            if(head.next == null || head.val != head.next.val){
                temp.next = head;
                temp = temp.next;
            }
            head = head.next;
        }
        return result.next;      
    }  
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
