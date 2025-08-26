class Solution {
    public String longestPalindrome(String s) {
        String res = "";
        for(int i=0;i<s.length();i++){
            for(int j = i;j<s.length();j++){
                if(s.charAt(i) != s.charAt(j)){
                    continue;
                }
                String curr = s.substring(i,j+1);
                int l = 0;
                int r = curr.length()-1;
                int t = 0;
                while(l<r){
                    if(curr.charAt(l) != curr.charAt(r)){
                        t = 1;
                        break;
                    }
                    else{
                        l++;
                        r--;
                    }
                }
                if(t==0){
                    res = res.length()>curr.length()?res:curr;
                }
            }
        }
        return res;
    }
}