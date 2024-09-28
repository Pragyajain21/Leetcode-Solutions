class Node
{
    int val;
    Node next;
    Node prev;
    Node(int val)
    {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
} 
class MyCircularDeque {
    Node head =null;
    Node rear =null;
    int size = 0;
    int capacity = 0;

    public MyCircularDeque(int k) {
        size = 0;
        capacity = k;
    }
    
    public boolean insertFront(int value) {
        if(isFull()==true)
        return false;
        Node newNode = new Node(value);
        if(head==null){
            head = newNode;
            rear = newNode;
        }else{
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
        size++;
        return true;


    }
    
    public boolean insertLast(int value) {
        if(isFull()){
            return false;
        }
        Node newNode = new Node(value); 
        if(head == null){
            head = newNode;
            rear = newNode;
        }else{
            rear.next = newNode;
            newNode.prev = rear;
            rear = newNode;
        }
        size++;
        return true;
    }
    
    public boolean deleteFront() {
        if(isEmpty())
        return false;
        if(size == 1){
            head = null;
            rear = null;
        }else{
         head = head.next;

        }

       
        size--;
        return true;

    }
    
    public boolean deleteLast() {
        if(isEmpty())
        return false;

        if(size == 1)
        {
            head = null;
            rear = null;
        }
        else
        {
        rear=rear.prev;
        rear.next = null;
        }
     size--;
     return true;

        
    }
    
    public int getFront() {
        if(isEmpty())
        return -1;
        else
        return head.val;
    }
    
    public int getRear() {
        if(isEmpty())
        return -1;
        else
        return rear.val;

    }
    
    public boolean isEmpty() {
        if(size == 0)
        return true;
        else
        return false;
    }
    
    public boolean isFull() {
        if(size == capacity)
        return true;
        else
        return false;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */