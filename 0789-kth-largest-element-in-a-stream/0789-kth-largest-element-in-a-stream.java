class KthLargest {

    PriorityQueue<Integer> pq;

    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<> ();
        for(int i=0;i<k;i++){
            pq.offer(Integer.MIN_VALUE);
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>pq.peek()){
                pq.poll();
                pq.offer(nums[i]);
            }
        }
    }
    
    public int add(int val) {
        int temp = pq.peek();
        if(val>=pq.peek()){
            pq.poll();
            pq.offer(val);
            temp = pq.peek();
        }
        return temp;
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */