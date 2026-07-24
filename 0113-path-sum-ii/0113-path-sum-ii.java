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
        List<List<Integer>> list = new ArrayList<>();
        helper(root,new ArrayList<>(),list,targetSum);
        return list;

    }
    private void helper(TreeNode root,List<Integer>current,List<List<Integer>>list,int targetSum){
        if(root == null) return;
        current.add(root.val);
        if(root.left == null && root.right == null){
            if (root.val == targetSum){
                
                list.add(new ArrayList<>(current));
               
            }
        }
        else{
            helper(root.left, current, list, targetSum - root.val);
            helper(root.right, current, list, targetSum - root.val);
        
        }
        current.remove(current.size() -1);
    }
}