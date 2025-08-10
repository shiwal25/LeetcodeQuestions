class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> res = new ArrayList<> ();
        List<Integer> pos = new ArrayList<> ();
        for(int i=0;i<nums.length;i++){
            if(nums[i] == key){
                pos.add(i);
            }
        }
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<pos.size();j++){
                if(Math.abs(i-pos.get(j)) <=k ){
                    res.add(i);
                    break;
                }
            }
        }
        return res;
    }
}