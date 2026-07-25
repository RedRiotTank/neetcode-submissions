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
    public int goodNodes(TreeNode root) {
        if (root == null) return 0;

        return numGoodNode(root, root.val);
    }


    private int numGoodNode(TreeNode node, int maxVal) {
        if (node == null) return 0;



        int counter = 0;

        if (node.val >= maxVal) {
            counter++;
            maxVal = node.val;
        }

        counter += numGoodNode(node.left, maxVal);
        counter += numGoodNode(node.right, maxVal);

        return counter;
    }
}
