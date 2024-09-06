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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set= new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        ListNode ptr = null;
        ListNode temp = head;
        while(temp!=null)
        {
            if(set.contains(temp.val))
            {
                if(temp==head)
                {
                    head = head.next;
                    temp = temp.next;
                }
                
                else{
                    ptr.next = temp.next;
                   
                    temp=temp.next;
                }
            }else{
                ptr=temp;
                
                temp=temp.next;
            }


        }
        return head;
    }
}