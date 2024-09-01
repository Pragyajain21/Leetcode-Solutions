class BrowserHistory {
    class Node{
        String data;
        Node prev;
        Node next;
        public Node(String data){
            this.data = data;
            this.prev = null;
            this.next =null;
        }
    }
    Node curr = null;

    public BrowserHistory(String homepage) {
        curr = new Node(homepage);
    }
    
    public void visit(String url) {
        Node newNode = new Node(url);
        curr.next = newNode;
        newNode.prev = curr;
        curr=curr.next; 
    }
    
    public String back(int steps) {
        while(steps>0 && curr.prev!=null ){
            curr=curr.prev;
            steps--;
        }
        return curr.data;
    }
    
    public String forward(int steps) {
        while(steps>0 && curr.next!=null){
            curr=curr.next;
            steps--;
        }
        return curr.data;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */