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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null || subRoot == null) return false;
        
        boolean sol = false;
        
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.add(root);

        TreeNode current = root;

        while (!deque.isEmpty() && !sol) {
            current = deque.poll();

            if (current.left != null)
                deque.add(current.left);

            if (current.right != null)
                deque.add(current.right);

            if (current.val == subRoot.val){
                sol = isSameTree(current, subRoot);
            }
        }

        return sol;
    }

    private boolean isSameTree(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) return true;

        if ((root != null && subRoot == null) || (root == null && subRoot != null)) return false;

        if (root.val != subRoot.val) return false;

        if (!isSameTree(root.left, subRoot.left) || !isSameTree(root.right, subRoot.right)) return false;

        return true;
    }
}
