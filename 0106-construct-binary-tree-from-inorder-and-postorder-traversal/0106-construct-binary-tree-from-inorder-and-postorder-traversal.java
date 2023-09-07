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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer, Integer>map = new HashMap<>();
        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i], i);
        }
        
        return helper(inorder, 0, inorder.length-1, postorder, 0, postorder.length-1, map);
    }
    
    
    TreeNode helper(int[]inorder, int inStart, int inEnd, int[]postorder, int postStart, int postEnd, HashMap<Integer, Integer>map){
        if(postStart > postEnd  || inStart>inEnd) return null;
        
        TreeNode root = new TreeNode(postorder[postEnd]);
        int inroot = map.get(root.val);
        int numleft = inroot- inStart;
        
        root.left = helper(inorder, inStart, inroot-1, postorder, postStart, postStart+numleft-1, map);
        root.right = helper(inorder, inroot+1, inEnd, postorder, postStart+numleft, postEnd-1, map);
        
        return root;

    }
}

// int ri = hm.get(postorder[pe]);
// 	TreeNode leftchild = buildTreePostIn(inorder, is, ri-1, postorder, ps, ps+ri-is-1, hm);
// 	TreeNode rightchild = buildTreePostIn(inorder,ri+1, ie, postorder, ps+ri-is, pe-1, hm);