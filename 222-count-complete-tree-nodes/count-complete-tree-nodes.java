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
    public int countNodes(TreeNode root) {
        if(root == null)
        return 0;
        int leftdepth = leftD(root);
        int rightdepth = rightD(root);
        if(leftdepth == rightdepth)
        return  (1<<leftdepth) -1;
        
        return 1+ countNodes(root.left)+countNodes(root.right);
    }
    public int leftD(TreeNode root){
        int dep = 0;
        while(root!=null){
            root = root.left;
            dep++;
        }
        return dep;
    }
     public int rightD(TreeNode root){
        int dep = 0;
        while(root!=null){
            root = root.right;
            dep++;
        }
        return dep;
    }
}