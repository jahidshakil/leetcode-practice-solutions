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
      int mx = 0;
    public int diameterOfBinaryTree(TreeNode root) {
      
        depth(root);
        return mx;
    }
    
    
    public int depth(TreeNode root){
        if(root== null) return 0;
        int left = depth(root.left);
        int right = depth(root.right);
        
        mx= Math.max(mx, left+right);
        return Math.max(left, right)+1;
    }
}