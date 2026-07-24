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

    boolean isBalanced = true;

    public boolean isBalanced(TreeNode root) {
        getHeight(root);

        return isBalanced;
    }

    private int getHeight(TreeNode root) {
        if (root == null) return 0;

        int left = getHeight(root.left);
        int right = getHeight(root.right);

        int diff = Math.abs(left - right);

        if(diff > 1) isBalanced = false;

        if (left > right) return 1 + left;
        else return 1 + right;

    }
}
