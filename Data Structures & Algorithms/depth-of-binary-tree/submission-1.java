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
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        int depth = 0;

        Deque<TreeNode> fifo = new ArrayDeque();
        fifo.add(root);
        int process = 1;

        while (!fifo.isEmpty()) {

            TreeNode node = fifo.poll();
            process--;


            if(node.left != null) {
                fifo.add(node.left);
            }

            if(node.right != null) {
                fifo.add(node.right);
            }

            if (process == 0) {
                process = fifo.size();
                depth++;
            }
        }

        return depth;

    }
}
