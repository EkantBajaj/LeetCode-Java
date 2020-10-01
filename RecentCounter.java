class RecentCounter {
     public Deque<Integer> deque = new ArrayDeque<Integer>();
    
    public RecentCounter() {
        
    }
    
    public int ping(int t) {
        this.deque.offer(t);
        while (this.deque.peek()< this.deque.peekLast() - 3000)
            deque.poll();
        return deque.size();
        
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
