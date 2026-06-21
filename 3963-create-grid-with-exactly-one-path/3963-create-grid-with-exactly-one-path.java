class Solution {
    public String[] createGrid(int m, int n) {
        String res[][] = new String[m][n];
        for(int i=1;i<m;i++){
            Arrays.fill(res[i], "#");
        }
        Arrays.fill(res[0], ".");
        for(int i=1;i<m;i++){
            res[i][n-1] = ".";
        }
        String temp[] = new String[m];
        for(int i=0;i<m;i++){
            StringBuilder str = new StringBuilder();
            for(int j=0;j<n;j++){
                str.append(res[i][j]);
            }
            temp[i] = str.toString();
        }
        return temp;
    }
}