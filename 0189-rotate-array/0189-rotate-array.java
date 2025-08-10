class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        int i = 0;
        int m = nums.length-k-1;
        while(i<m){
            int temp = nums[i];
            nums[i] = nums[m];
            nums[m] = temp;
            i++;
            m--;
        }
        i = nums.length-k;
        m = nums.length-1;
        while(i<m){
            int temp = nums[i];
            nums[i] = nums[m];
            nums[m] = temp;
            i++;
            m--;
        }
        i = 0;
        m = nums.length-1;
        while(i<m){
            int temp = nums[i];
            nums[i] = nums[m];
            nums[m] = temp;
            i++;
            m--;
        }
    }
}