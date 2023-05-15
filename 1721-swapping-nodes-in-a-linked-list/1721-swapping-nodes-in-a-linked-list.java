/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode leftNode = head, rightNode = head;
        
        for (int i = 1; i < k; i++) {
            leftNode = leftNode.next;
        }
        
        
        ListNode cur = leftNode;
        while(cur.next != null){
            cur=cur.next;
            rightNode=rightNode.next;
        }
        
        int temp  =rightNode.val;
        rightNode.val=leftNode.val;
        leftNode.val=temp;
        
        
        
        return head;
    }
}