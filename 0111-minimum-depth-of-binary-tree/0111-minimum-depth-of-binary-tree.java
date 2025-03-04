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
    public int minDepth(TreeNode root) {
        if (root == null) return 0;

        return findMinDepth(root);
    }
         public int findMinDepth(TreeNode root)
         {
            if (root.left == null && root.right == null)
            {
                return 1;
            }

            int left = Integer.MAX_VALUE;

        if (root.left != null)
        {
            left = 1 + findMinDepth(root.left);
        }

       int right = Integer.MAX_VALUE;

       if (root.right != null)
       {
        right = 1 + findMinDepth(root.right);
       }
        return Math.min(left, right);
    }
}