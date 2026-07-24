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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        if(root == null) return res;

        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.add(root);

        int counter = 1;

        while (!deque.isEmpty()) {
            TreeNode current = deque.poll();
            counter--;

            if(counter == 0) {
                res.add(current.val);
            }

            if (current.left != null){
                deque.add(current.left);
            }

            if (current.right != null) {
                deque.add(current.right);
            }

            if (counter == 0) {
                counter = deque.size();
            }    
        }

        return res;
    }
}