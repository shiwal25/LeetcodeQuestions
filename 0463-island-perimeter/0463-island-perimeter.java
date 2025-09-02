class Solution {
    public int islandPerimeter(int[][] grid) {
        int p = 0;
        for(int i=0;i<grid.length;i++){
            int r = grid.length;
            for(int j=0;j<grid[i].length;j++){
                int c = grid[i].length;
                if(grid[i][j] == 0){
                    continue;
                }
                if((j-1 >= 0 && grid[i][j-1] == 0) || j-1 < 0){
                    p++;
                }
                if((j+1 < c && grid[i][j+1] == 0) || j+1 == c){
                    p++;
                }
                if((i-1 >= 0 && grid[i-1][j] == 0) || i-1 < 0){
                    p++;
                }
                if((i+1 < r && grid[i+1][j] == 0) || i+1 == r){
                    p++;
                }
            }
        }
        return p;
    }
}