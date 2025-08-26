class Solution {
    public int[] findErrorNums(int[] nums) {
        int arr[] = new int[nums.length+1];
        Arrays.fill(arr,0);
        int s = 0;
        int res[] = new int[2];
        int os = (nums.length*(nums.length+1))/2;
        for(int i=0;i<nums.length;i++){
            s = s+nums[i];
            arr[nums[i]]++;
            if(arr[nums[i]] == 2){
                s = s-nums[i];
                res[0] = nums[i];
            }
        }
        res[1] = os-s;
        return res;
    }
}