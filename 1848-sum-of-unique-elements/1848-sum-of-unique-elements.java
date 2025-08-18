class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> hs = new HashMap<> ();
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
        }
        for(Integer key: hs.keySet()){
            if(hs.get(key) == 1){
                sum = sum + key;
            }
        }
        return sum;
    }
}