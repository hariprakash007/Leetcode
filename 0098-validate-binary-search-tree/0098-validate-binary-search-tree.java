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
    public boolean isValidBST(TreeNode root) {
        return checkSubTree(root.left, Long.MIN_VALUE, root.val) && checkSubTree(root.right, root.val, Long.MAX_VALUE);
    }

    public boolean checkSubTree(TreeNode node, long min, long max)
    {
        if (node == null) return true;
        if(node.val <= min || node.val >= max) return false;

        return checkSubTree(node.left, min, node.val) && checkSubTree(node.right, node.val, max);
    }
 }