class AllOne {
    class Node{
        int count;
        List<String> keys;
        Node next;
        Node prev;

        Node(int count){
            this.count = count;
            keys = new ArrayList<>();
            next = null;
            prev = null;
        }
    }
    Node last;
    Node head;
    HashMap<String,Node> map = new HashMap<>();


    public AllOne() {
        head = new Node(0);
        last = head; 
    }
    public void addNode(Node prevNode ,int count){
        Node newNode  = new Node(count);
        newNode.next = prevNode.next;
        newNode.prev = prevNode;
        if(newNode.next != null){
            newNode.next.prev = newNode;
        }
        prevNode.next = newNode;
        if(prevNode==last)
        last = newNode;
    }
    public void removeNode(Node node)
    {
        node.prev.next = node.next;
        if(node.next != null){
           node.next.prev = node.prev; 
        }
        if(node == last){
            last=node.prev;
        }
    }
    
    public void inc(String key) 
    {
        if(!map.containsKey(key)){
            if(head.next == null || head.next.count != 1){
                addNode(head,1);
            }
            head.next.keys.add(key);
            map.put(key,head.next);

        }else
        {
            Node currNode = map.get(key);
            int currCount = currNode.count;
            if(currNode.next == null || currNode.next.count!=currCount+1){
                addNode(currNode,currCount+1);
            }
            currNode.next.keys.add(key);
            map.put(key,currNode.next);
            currNode.keys.remove(key);
            if(currNode.keys.isEmpty()){
                removeNode(currNode);
            }
        }
    }
    
    public void dec(String key) {
        Node currNode = map.get(key);
        int currCount = currNode.count;
        if(currCount == 1)
        map.remove(key);
        else{
            if(currNode.prev.count!= currCount-1)
            addNode(currNode.prev,currCount - 1);
            currNode.prev.keys.add(key);
            map.put(key,currNode.prev);
        }
        currNode.keys.remove(key);
        if(currNode.keys.isEmpty()){
            removeNode(currNode);
        }
    }
    
    public String getMaxKey() {
        if(last == head)
        return "";
        return last.keys.get(0);

    }
    
    public String getMinKey() {
        if(head.next==null)
        return "";
        return head.next.keys.get(0);
    }
}

/**
 * Your AllOne object will be instantiated and called as such:
 * AllOne obj = new AllOne();
 * obj.inc(key);
 * obj.dec(key);
 * String param_3 = obj.getMaxKey();
 * String param_4 = obj.getMinKey();
 */