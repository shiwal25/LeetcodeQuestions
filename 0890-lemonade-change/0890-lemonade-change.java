class Solution {
    public boolean lemonadeChange(int[] bills) {
        HashMap<Integer,Integer> hs = new HashMap<> ();
        hs.put(5,0);
        hs.put(10,0);
        hs.put(20,0);
        for(int i=0;i<bills.length;i++){
            if(bills[i] == 5){
                hs.put(5,hs.getOrDefault(5,0)+1);
                continue;
            }
            else if(bills[i] == 10){
                if(hs.get(5)>0){
                    hs.put(5,hs.getOrDefault(5,0)-1);
                    hs.put(10,hs.getOrDefault(10,0)+1);
                }
                else{
                    return false;
                }
            }
            else{
                if(hs.get(5)>=3 || (hs.get(10)>=1 && hs.get(5)>=1)){
                    hs.put(20,hs.getOrDefault(20,0)+1);
                    if(hs.get(10)>=1 && hs.get(5)>=1){
                        hs.put(5,hs.getOrDefault(5,0)-1);
                        hs.put(10,hs.getOrDefault(10,0)-1);
                    }
                    else{
                        hs.put(5,hs.getOrDefault(5,0)-3);
                    }
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}