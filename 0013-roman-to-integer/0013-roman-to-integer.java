class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> hm = new HashMap<> ();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        int res = 0;
        int prev = 0;
        int temp = 0;
        temp = hm.get(s.charAt(s.length()-1));
        res = res+temp;
        for(int i = s.length()-2;i>=0;i--){
            prev = hm.get(s.charAt(i+1));
            temp = hm.get(s.charAt(i));
            // res = res+hm.get(s.charAt(i));
            if(prev<=temp){
                res = res+hm.get(s.charAt(i));
            }
            else{
                res = res-hm.get(s.charAt(i));
            }
        }
        return res;
    }
}