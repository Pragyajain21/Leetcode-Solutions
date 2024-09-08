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
    public ListNode[] splitListToParts(ListNode head, int k) {
     ListNode res[]= new ListNode[k];
     ListNode prev = null;
     ListNode curr = head;
     int l = 0;
     while(curr!=null){
        l++;
        curr =curr.next;
     }
     int nodeInEachBucket = l/k;
     int rem = l%k; 
     curr = head;
     for(int i=0;i<k;i++)
     {
        res[i]= curr;
        for(int cnt=1;cnt<=l/k+((rem>0)?1:0);cnt++){
            if(curr!=null){
             prev = curr;
            curr= curr.next;

            }
            
        }
        if(prev!=null)
           prev.next = null;
        rem--;
     }  
     return res; 
    }
}