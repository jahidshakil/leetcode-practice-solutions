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
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<TreeNode>q = new ArrayList<>();
        List<List<Integer>>res = new ArrayList<>();
        if(root == null) return res;
        q.add(root);
        
        while(!q.isEmpty()){
            ArrayList<Integer>arr = new ArrayList<>();
            int size = q.size();
            for(int i=0; i<size; i++){
            TreeNode temp = q.remove(0);
            if(temp.left != null){
                q.add(temp.left);
            }
            if(temp.right != null){
                q.add(temp.right);
            }
                arr.add(temp.val);
            }
            
            res.add(arr);
            
        }
        
        return res;
    }
}