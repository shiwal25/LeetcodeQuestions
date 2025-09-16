class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        ArrayList<Integer> res = new ArrayList<> ();
        for(int i=0;i<nums.length;i++){
            int temp = nums[i];
            while(!res.isEmpty()){
                int last = res.get(res.size()-1);
                if(gcd(last,temp) == 1){
                    break;
                }
                int lcm = (int)(((long)temp*last)/gcd(temp,last));
                res.remove(res.size()-1);
                temp = lcm;
            }
            res.add(temp);
        }
        return res;
    }
    public int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b,a%b);
    }
}