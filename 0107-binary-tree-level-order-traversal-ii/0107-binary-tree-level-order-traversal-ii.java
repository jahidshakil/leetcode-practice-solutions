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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode>q = new LinkedList<>();
            List<List<Integer>>res = new ArrayList<>();
        q.add(root);
        if(root == null) return res;
        while(!q.isEmpty()){
            int size = q.size();
            ArrayList<Integer>arr = new ArrayList<>();
            for(int i=0; i<size; i++){
                TreeNode temp = q.poll();
                arr.add(temp.val);
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
            }
            res.add(arr);
        }
        
         Collections.reverse(res);
        return res;
    }
}