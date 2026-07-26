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

    int counter = 0;
    int foundVal = 0;

    public int kthSmallest(TreeNode root, int k) {
        inOrder(root, k);
        return foundVal;
    }

    private void inOrder(TreeNode node, int k) {
        if (node == null) return;

        inOrder(node.left, k);

        counter++;
        if (counter == k) {
            foundVal = node.val;
        }

        inOrder(node.right, k);
    }
}
