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
    public TreeNode replaceValueInTree(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int n = q.size();
            int levelsum = 0;
            for(int i=0;i<n;i++)
            {
                TreeNode temp = q.poll();
                levelsum+=temp.val;
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
            list.add(levelsum);
        }
        q.add(root);
        root.val = 0;
        int level = 1;
        while(!q.isEmpty()){
            int n = q.size();
            for(int i=0;i<n;i++)
            {
                TreeNode temp = q.poll();
                if(temp.left!=null && temp.right!=null){
                    int val = (temp.left.val + temp.right.val);
                    temp.left.val = (list.get(level) - val );
                    temp.right.val = (list.get(level) - val);
                    q.add(temp.left);
                    q.add(temp.right);
                }
                else if(temp.right!=null){
                    temp.right.val = list.get(level) - temp.right.val;
                    q.add(temp.right);
                }
                else if(temp.left!=null){
                    temp.left.val = list.get(level) - temp.left.val;
                    q.add(temp.left);
                }

            }
            level++;
            
        }
        return root;


    }
}