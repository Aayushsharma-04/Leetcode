class RecentCounter {
     private Queue<Integer>Q;

    public RecentCounter() {
        this.Q = new LinkedList<>();
    }
    
    public int ping(int t) {
        Q.offer(t);
        while(Q.peek() < t-3000){
            Q.poll();
        }
        return Q.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */