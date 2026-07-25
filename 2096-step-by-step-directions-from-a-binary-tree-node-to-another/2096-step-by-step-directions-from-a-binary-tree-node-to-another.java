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
    public String getDirections(TreeNode root, int startValue, int destValue) {
        StringBuilder startpath = new StringBuilder();
        StringBuilder destipath = new StringBuilder();
        Findpath(root,startValue,startpath);
        Findpath(root,destValue,destipath);
        startpath.reverse();
        destipath.reverse();

        int i = 0;
        int minLen = Math.min(startpath.length(), destipath.length());
        while (i < minLen && startpath.charAt(i) == destipath.charAt(i)) {
            i++;
        }
        StringBuilder result = new StringBuilder();
        for (int j = i; j < startpath.length(); j++) {
            result.append('U');
        }
        result.append(destipath.substring(i));

        return result.toString();
    }
    private boolean Findpath(TreeNode root,int target,StringBuilder path){
        if (root == null) return false;
        if(root.val == target) return true;

        if(Findpath(root.left,target,path)){
            path.append("L");
            return true;
        }
        if(Findpath(root.right,target,path)){
            path.append("R");
            return true;
        }
        return false;
    }
}