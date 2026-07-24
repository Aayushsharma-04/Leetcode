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
    private int maxlength =0;
    public int longestUnivaluePath(TreeNode root) {
        solve(root);
        return maxlength;
        
    }
    private int solve(TreeNode root){
        if ( root == null) return 0;
        int left = solve(root.left);
        int right = solve(root.right);
        int leftpath = 0;
        if( root.left != null &&root.left.val == root.val){
            leftpath  = left +1;
        }
        int rightpath =0;
        if(root.right != null && root.right.val == root.val){
            rightpath = right +1;
        }
        maxlength = Math.max(maxlength , rightpath+leftpath);

        return Math.max(leftpath,rightpath);
    }
}