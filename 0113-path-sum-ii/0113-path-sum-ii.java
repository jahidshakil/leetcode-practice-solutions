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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res= new ArrayList<>();
        
        helper(root, targetSum, res, new ArrayList<>());
        return res;
    }
    
    
    void helper(TreeNode root, int targetSum, List<List<Integer>>res, List<Integer>path){
        // List<Integer> path = new ArrayList<>();
        if(root == null) return;
        path.add(root.val);
        if(root.left == null && root.right == null && root.val == targetSum){
            res.add(path);
        }
        
        helper(root.left, targetSum - root.val, res, new ArrayList<>(path));
        helper(root.right, targetSum - root.val, res, new ArrayList<>(path));

        
        
    }
}