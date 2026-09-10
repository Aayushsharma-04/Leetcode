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
    public int averageOfSubtree(TreeNode root) {
        if(root == null) return 0;
        int sum = Sum(root);
        int Nodecount = Count(root);
        int avg =0;
        if(Nodecount!=0){
             avg = sum/Nodecount;
        }
        
        int count =0;
        if(  root.val == avg){
            count =1;
        }
        count += averageOfSubtree(root.left);
         count += averageOfSubtree(root.right);
        return count;
    }

    private int Sum(TreeNode root){
        if (root == null) return 0;

        return root.val + Sum(root.left)+ Sum(root.right);
    }

    private int Count(TreeNode root){
        if(root == null) return 0;

        return 1 + Count(root.left) + Count(root.right);
    }
}