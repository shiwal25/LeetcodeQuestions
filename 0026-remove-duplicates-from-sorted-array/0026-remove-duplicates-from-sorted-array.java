class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0;;
        int i=1;
        for(i=1;i<nums.length;i++){
            if(nums[i]!=nums[j]){
                //swap
                nums[j+1] = nums[i];
                j++;
            }
        }
        return j+1;
    }
}