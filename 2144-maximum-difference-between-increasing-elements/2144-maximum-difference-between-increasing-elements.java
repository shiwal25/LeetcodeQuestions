class Solution {
    public int maximumDifference(int[] nums) {
        int m = nums[0];
        int res = 0;
        for(int i=0;i<nums.length;i++){
            m = Math.min(m,nums[i]);
            res = Math.max(res,nums[i]-m);
        }
        if(res == 0){
            return -1;
        }
        return res;
    }
}