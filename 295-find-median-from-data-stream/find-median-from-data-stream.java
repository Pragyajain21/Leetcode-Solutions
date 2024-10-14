class MedianFinder {
    PriorityQueue<Integer>maxheap;
    PriorityQueue<Integer> minheap;

    public MedianFinder() {
        maxheap = new PriorityQueue<>(Collections.reverseOrder());
        minheap = new PriorityQueue<>(); 
    }
    
    public void addNum(int num) {
        if(maxheap.isEmpty() || num<maxheap.peek()){
            maxheap.add(num);
        }else{
            minheap.add(num);
        }

        if(maxheap.size()>minheap.size()+1){
            minheap.add(maxheap.peek());
            maxheap.poll();
        }
        if(minheap.size()>maxheap.size()){
            maxheap.add(minheap.peek());
            minheap.poll();
        }
      
    }
    
    public double findMedian() {
        if(maxheap.size()>minheap.size())
        return maxheap.peek();
        else
        {
            double mean = (maxheap.peek()+minheap.peek())/2.0;
            return mean;
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */