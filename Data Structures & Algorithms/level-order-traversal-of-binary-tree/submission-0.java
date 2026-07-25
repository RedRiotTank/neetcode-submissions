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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;

        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.add(root);
        int counter = 1;

        List<Integer> newList = new ArrayList<>();

        while (!deque.isEmpty()) {
            TreeNode current = deque.poll();
            counter--;
            newList.add(current.val);

            if (current.left != null) deque.add(current.left);
            if (current.right != null) deque.add(current.right);

            if (counter == 0) {
                counter = deque.size();
                res.add(new ArrayList<>(newList));
                newList.clear();
            }
        }

        return res;
    }
}