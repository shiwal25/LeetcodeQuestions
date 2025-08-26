class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int a = 0;
        double d = 0.0d;
        double md = 0.0d;
        int ma = 0;
        for(int i=0;i<dimensions.length;i++){
            d = Math.sqrt((dimensions[i][0]*dimensions[i][0]) + (dimensions[i][1]*dimensions[i][1]));
            a = dimensions[i][0]*dimensions[i][1];
            if(d>md){
                ma = a;
                md = d;
            }
            else if(d == md){
                ma = Math.max(a,ma);
            }
            else{
                continue;
            }
        }
        return ma;
    }
}