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

    private int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {

        getTreeHeigth(root);

        return maxDiameter;
    }

    private int getTreeHeigth(TreeNode node) {
        if (node == null) return 0;

        var hLeft = getTreeHeigth(node.left);
        var hright = getTreeHeigth(node.right);

        int diameter = hright + hLeft;

        if (diameter > maxDiameter)
            maxDiameter = diameter;

        return 1 + Math.max(hLeft, hright);

    }
}
