class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<dtype> pq = new PriorityQueue<dtype> (Collections.reverseOrder());
        for(int i=0;i<k;i++){
            pq.add(new dtype(arr[i],Math.abs(arr[i]-x)));
        }
        for(int i=k;i<arr.length;i++){
            if(pq.peek().diff > Math.abs(arr[i]-x)){
                pq.poll();
                pq.offer(new dtype(arr[i],Math.abs(arr[i]-x)));
            }
            else if((pq.peek().diff == Math.abs(arr[i]-x)) && (pq.peek().val>arr[i])){
                pq.poll();
                pq.offer(new dtype(arr[i],Math.abs(arr[i]-x)));
            }
            else{
                continue;
            }
        }
        List<Integer> res = new ArrayList<> ();
        while(!pq.isEmpty()){
            res.add(pq.poll().val);
        }
        Collections.sort(res);
        return res;

    }
}
class dtype implements Comparable<dtype>{
    int val;
    int diff;
    dtype(int v, int d){
        val = v;
        diff = d;
    }
    public int compareTo(dtype t){
        if(diff<t.diff){
            return -1;
        }
        else{
            return 1;
        }
    }
}