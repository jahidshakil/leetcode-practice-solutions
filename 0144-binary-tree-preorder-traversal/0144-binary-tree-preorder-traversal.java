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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        helper(res, root);
        return res;
    }
    
    void helper(List<Integer>res, TreeNode root){
        if(root == null) return;
        res.add(root.val);
        if(root.left != null) helper(res, root.left);
        if(root.right != null) helper(res, root.right);

    }
}