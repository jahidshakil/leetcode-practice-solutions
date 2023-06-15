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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode>q = new LinkedList();
        q.add(root);


        int mxSum= root.val;
        int level =1;
        int ans = 1;
        
        
        while(!q.isEmpty()){
            int levelSum =0;
            int levelSize = q.size();

            for(int i=0; i<levelSize; i++){
                TreeNode cur = q.remove();
                levelSum += cur.val;
                if(cur.left!=null) q.add(cur.left);
                if(cur.right != null) q.add(cur.right);
            }
                        
            if(levelSum > mxSum){
                mxSum=levelSum;
                ans=level;
            }
             level++;

        }
        
        return ans;
    }
}
