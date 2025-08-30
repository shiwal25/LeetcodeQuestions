class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> hs3 = new HashSet<> ();
        HashSet<Character> hs4 = new HashSet<> ();
        HashSet<Character> hs5 = new HashSet<> ();
        for(int i=0;i<9;i++){
            HashSet<Character> hs1 = new HashSet<> ();
            HashSet<Character> hs2 = new HashSet<> ();
            if(i == 0 || i == 3 || i == 6){
                hs3.clear();
                hs4.clear();
                hs5.clear();
            }
            for(int j=0;j<9;j++){
                if(board[i][j] != '.'){
                    if(hs1.contains(board[i][j])){
                        return false;
                    }
                    else{
                        hs1.add(board[i][j]);
                    }

                    if(j<3){
                        if(hs3.contains(board[i][j])){
                            return false;
                        }
                        else{
                            hs3.add(board[i][j]);
                        }
                    }
                    else if(j>=3 && j<6){
                        if(hs4.contains(board[i][j])){
                            return false;
                        }
                        else{
                            hs4.add(board[i][j]);
                        }
                    }
                    else{
                        if(hs5.contains(board[i][j])){
                            return false;
                        }
                        else{
                            hs5.add(board[i][j]);
                        }
                    }
                }
                if(board[j][i] != '.'){
                    if(hs2.contains(board[j][i])){
                        return false;
                    }
                    else{
                        hs2.add(board[j][i]);
                    }
                }
            }
        }
        return true;
    }
}