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
    public int pathSum(TreeNode root, int targetSum) {
        int[] count = new int[1]; 
        List<Integer>current = new ArrayList<>();
        helper(root,current,count,targetSum);
        return count[0];
    }
     private void helper(TreeNode root,List<Integer>current,int []count,int targetSum){
        if(root == null) return;
        current.add(root.val);
        long sum =0;
            for(int i =current.size() -1; i>=0;i--){
                sum += current.get(i);
                if(sum == targetSum){
                    count[0]++;
                }
            }
        
            helper(root.left, current, count, targetSum);
            helper(root.right, current,count, targetSum);
           
        
        
        current.remove(current.size() -1);
    }
}