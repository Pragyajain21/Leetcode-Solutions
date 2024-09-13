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
    TreeNode dummy = new TreeNode(0);
    TreeNode curr = dummy;
    public TreeNode increasingBST(TreeNode root) {
        solve(root);
        return dummy.right;

    }
    public void solve(TreeNode root){
        if(root==null)
        return ;
        solve(root.left);
        root.left = null;
        curr.right = root;
        curr= root;
        solve(root.right);
    }
}