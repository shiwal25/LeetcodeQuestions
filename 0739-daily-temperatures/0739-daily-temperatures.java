class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s = new Stack<> ();
        s.push(temperatures.length-1);
        int res[] = new int[temperatures.length];
        res[temperatures.length-1] = 0;
        for(int i = temperatures.length-2;i>=0;i--){
            while(s.isEmpty()==false && temperatures[s.peek()]<=temperatures[i]){
                s.pop();
            }
            int x = s.isEmpty()?0:s.peek()-i;
            res[i] = x;
            s.push(i);
        }
        return res;
    }
}