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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode>q = new LinkedList<>();
        List<List<Integer>>res= new ArrayList<>();
        
        if(root == null) return res;
        
        q.offer(root);
        boolean leftToright = true;
        while(!q.isEmpty()){
            int size = q.size();
            
            LinkedList<Integer>arr = new LinkedList<>();
            
            for(int i=0; i<size; i++){
                TreeNode current= q.poll();
                if(current.left != null) q.offer(current.left);
                if(current.right != null) q.offer(current.right);
                arr.add(current.val);                
            }
            if(!leftToright){
                Collections.reverse(arr);
            }

            res.add(arr);
            
            leftToright= !leftToright;
        }
        return res;
    }
}
