class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> p = new PriorityQueue<> (Collections.reverseOrder());
        for(int i=0;i<stones.length;i++){
            p.add(stones[i]);
        }
        while(p.size()>=2){
            int x = p.poll();
            int y = p.poll();
            if(x == y){
                continue;
            }
            else{
                if(x>y){
                    p.add(x-y);
                }
                else{
                    p.add(y-x);
                }
            }
        }
        if(!p.isEmpty()){
            return p.poll();
        }
        return 0;
    }
}