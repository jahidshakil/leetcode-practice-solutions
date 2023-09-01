/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    TreeNode first = null;
    TreeNode second = null;
    TreeNode previous = null;
    public void recoverTree(TreeNode root) {
        inorder(root);
        int temp = first.val;
        first.val=second.val;
        second.val=temp;
    }
    
    
    public void inorder(TreeNode root){
        if(root == null) return ;
        
        inorder(root.left);
        if(first==null && (previous==null ||previous.val>=root.val)){
            first = previous;
        }
        
        //find the second node which is at wrong position
        if(first!=null && previous.val>=root.val){
            second = root;
        }
        
        previous=root;
        
        inorder(root.right);
    }
}