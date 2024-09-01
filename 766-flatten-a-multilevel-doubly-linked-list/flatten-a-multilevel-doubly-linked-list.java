/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node temp = head;
        Node ptr =null;
        Stack<Node> st= new Stack<>();
        while(temp!=null)
        {
            if(temp.child!=null){
                if(temp.next!=null)
                temp.next.prev = null;
                st.push(temp.next);
                temp.next = temp.child;
                temp.child.prev=temp;
                temp.child=null;
            }
            else{
                ptr = temp;
                temp=temp.next;
            }
        }
        while(!st.isEmpty()){
            temp =st.peek();
            st.pop();
            ptr.next = temp;
            if(temp!=null)
            temp.prev = ptr;
            while(temp!=null){
                ptr=temp;
                temp=temp.next;
            }
        }
        return head;
    }
}