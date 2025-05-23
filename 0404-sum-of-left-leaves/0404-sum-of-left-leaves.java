class Solution {
    public int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        helper(root, false);
        return sum;
    }

    public void helper(TreeNode root, boolean left)
    {
        if(root.left == null && root.right == null && left)
        {
            sum = sum + root.val;
            return;
        }
        if (root.left != null)
           helper(root.left, true);
        if(root.right != null)
           helper(root.right, false);   
    }
}