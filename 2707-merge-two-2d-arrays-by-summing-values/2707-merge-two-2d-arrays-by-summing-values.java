class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int i=0;
        int j=0;
        int k=0;
        HashSet<Integer> hs = new HashSet<> ();
        for(i=0;i<l1;i++){
            hs.add(nums1[i][0]);
        }
        for(i=0;i<l2;i++){
            hs.add(nums2[i][0]);
        }
        i=0;
        int res[][] = new int[hs.size()][2];
        while(i != l1 && j != l2){
            if(nums1[i][0] < nums2[j][0]){
                res[k][0] = nums1[i][0];
                res[k][1] = nums1[i][1];
                k++;
                i++;
            }
            else if(nums1[i][0] > nums2[j][0]){
                res[k][0] = nums2[j][0];
                res[k][1] = nums2[j][1];
                k++;
                j++;
            }
            else{
                res[k][0] = nums1[i][0];
                res[k][1] = nums1[i][1]+nums2[j][1];
                k++;
                i++;
                j++;
            }
        }
        while(i!=l1){
            res[k][0] = nums1[i][0];
            res[k][1] = nums1[i][1];
            k++;
            i++;
        }
        while(j!=l2){
            res[k][0] = nums2[j][0];
                res[k][1] = nums2[j][1];
                k++;
                j++;
        }
        return res;
    }
}