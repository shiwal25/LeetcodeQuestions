class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int res[] = new int[k];
        HashMap<Integer,Integer> hm = new HashMap<> ();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<type> pq = new PriorityQueue<type> ();
        for(int i=0;i<k;i++){
            pq.add(new type(0, 0));
        }
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            if(pq.peek().freq<entry.getValue()){
                pq.poll();
                pq.add(new type(entry.getKey(), entry.getValue()));
            }
        }
        for(int i=0;i<k;i++){
            res[i] = pq.poll().val;
        }
        return res;
    }
}
class type implements Comparable<type>{
    int val;
    int freq;
    type(int x, int f){
        val = x;
        freq = f; 
    }
    public int compareTo(type t){
        if(freq<t.freq){
            return -1;
        }
        else{
            return 1;
        }
    }
}