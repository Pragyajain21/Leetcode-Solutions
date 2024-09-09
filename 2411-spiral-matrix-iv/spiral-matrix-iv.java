/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int ans[][]=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(ans[i],-1);
        }
        int left = 0;
        int right = n-1;
        int up = 0;
        int down = m-1;
        ListNode temp = head;
        while(temp != null){
            for(int i=left;i<=right;i++){
                if(temp!=null){
                    ans[up][i]=temp.val;
                temp=temp.next;

                }
                
            }
            up++;
            for(int i=up;i<=down;i++){
                if(temp!=null){
                 ans[i][right]=temp.val;
                temp=temp.next;
                }
                
            }
            right--;
            for(int i=right;i>=left;i--)
            {
               if(temp!=null)
            {
                ans[down][i]=temp.val;
                temp=temp.next;
            }
                
            }
            down--;
            for(int i=down;i>=up;i--){
                if(temp!=null){
                    ans[i][left]=temp.val;
                    temp=temp.next;
                }
            }
            left++;
        }
        return ans;

    }
}