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
    public void flatten(TreeNode root) {
        Queue<Integer> q = new LinkedList<>();
        solve(root,q);
        q.poll();
        while(!q.isEmpty()){
            root.left = null;
            root.right = new TreeNode(q.peek());
            q.poll();
            root = root.right;
        }
        

        
    }
    private void solve(TreeNode root, Queue <Integer>q){
        if(root == null) return;
        q.offer(root.val);
        solve(root.left,q);
        solve(root.right,q);
    }
}