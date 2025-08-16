class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        int ps[] = new int[n];
        int ss[] = new int[n];
        int s = 0;
        for(int i=0;i<n;i++){
            ps[i] = s;
            s = s+nums[i];
        }
        s = 0;
        for(int i = n-1;i>=0;i--){
            ss[i] = s;
            s = s + nums[i];
        }
        for(int i = 0;i<n;i++){
            res[i] = Math.abs(ps[i]-ss[i]);
        }
        return res;
    }
}