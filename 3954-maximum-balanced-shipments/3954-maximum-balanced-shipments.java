class Solution {
    public int maxBalancedShipments(int[] weight) {
        // int res = 0;
        // int i=0;
        // int j = 0;
        // while(i<weight.length-1){
        //     int mw = weight[i];
        //     j = i+1;
        //     boolean found = false;
        //     while(j<weight.length && weight[j]<mw){
        //         mw = Math.max(mw,weight[j-1]);
        //         if(mw>weight[j]){
        //             res++;
        //             i = j+1;
        //             found = true;
        //             break;
        //         }
        //         j++;
        //     }
        //     if(!found){
        //         i++;
        //     }
        // }
        int res = 0;
        int mw = 0;
        for(int i=0;i<weight.length-1;i++){
            mw = Math.max(mw,weight[i]);
            if(weight[i+1]<mw){
                mw = 0;
                res++;
                i++;
            }
        }
        return res;
    }
}