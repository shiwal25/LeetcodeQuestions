class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hs = new HashSet<> ();
        while(n!=1 && !hs.contains(n)){
            hs.add(n);
            int s = 0;
            while(n!=0){
                int d = n%10;
                n = n/10;
                s  = s+(d*d); 
            }
            n = s;
            if(hs.contains(n)){
                return false;
            }
        }
        return true;
    }
}