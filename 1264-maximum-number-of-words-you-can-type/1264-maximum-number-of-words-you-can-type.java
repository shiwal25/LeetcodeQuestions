class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        HashSet<Character> hs = new HashSet<> ();
        for(int i=0;i<brokenLetters.length();i++){
            hs.add(brokenLetters.charAt(i));
        }
        int count = 0;
        int word = 0;
        int totalWords = 0;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i) == ' '){
                if(word>0){
                    count++;
                }
                word = 0;
                totalWords++;
            }
            if(hs.contains(text.charAt(i))){
                word++;
            }
        }
        if(word>0){
            count++;
        }
        return totalWords-count+1;
    }
}