class Solution {
    public String sortVowels(String s) {
        HashMap<Character, Integer> hs = new HashMap<>();
        HashSet<Character> h = new HashSet<> ();
        String so = "AEIOUaeiou";
        StringBuilder str = new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U' || s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                hs.put(s.charAt(i),hs.getOrDefault(s.charAt(i),0)+1);
                h.add(s.charAt(i));
                str.setCharAt(i,'#');
            }
        }
        for(int i=0;i<s.length();i++){
            if(str.charAt(i) == '#'){
                int temp = 0;
                int c = 0;
                while(temp == 0){
                    if(h.contains(so.charAt(c))){
                        temp = hs.get(so.charAt(c));
                        if(temp == 0){
                            hs.remove(so.charAt(c));
                            h.remove(so.charAt(c));
                        }
                    }
                    c++;
                }
                hs.put(so.charAt(c-1),temp-1);
                str.setCharAt(i,so.charAt(c-1));
            }
        }
        return str.toString();
    }
}