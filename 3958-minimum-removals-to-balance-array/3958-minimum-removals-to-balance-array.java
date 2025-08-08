class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int res = 0; 
        int l = 0;
        int r = 0;
        while(r<nums.length){
            if(nums[r]<=(long)nums[l]*k){
                res = Math.max(res,r-l+1);
                r++;
            }
            else{
                l++;
            }
        }
        return nums.length-res;
    }
}