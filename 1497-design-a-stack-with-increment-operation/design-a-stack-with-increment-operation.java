class CustomStack {
    int capacity = 0;
    int arr[];
    int top = 0;

    public CustomStack(int maxSize) {
       arr=new int[maxSize];
        top=-1;
        capacity = maxSize;
        
    }
    
    public void push(int x) {
        if(top == capacity - 1)
        return;
        top++;
        arr[top]=x;

    }
    
    public int pop() {
        if(top == -1)
        return -1;
       int val = arr[top];
       top--;
       return val;

    }
    
    public void increment(int k, int val) {
        for(int i=0;i<Math.min(k,capacity);i++){
            arr[i] = arr[i]+val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */