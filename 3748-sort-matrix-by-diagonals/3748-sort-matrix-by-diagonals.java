class Solution {
    public int[][] sortMatrix(int[][] grid) {
        for(int i=0;i<grid.length;i++) {
            ArrayList<Integer> temp = new ArrayList<> (); 
            int t = i;
            int j = 0;
            while(t<grid.length){
                temp.add(grid[t][j]);
                t++;
                j++;
            }
            Collections.sort(temp, Collections.reverseOrder());
            t = i;
            j = 0;
            while(t<grid.length){
                grid[t][j] = temp.get(0);
                temp.remove(0);
                t++;
                j++;
            }
        }
        for(int i=1;i<grid.length;i++) {
            ArrayList<Integer> temp = new ArrayList<> (); 
            int t = i;
            int j = 0;
            while(t<grid.length){
                temp.add(grid[j][t]);
                t++;
                j++;
            }
            Collections.sort(temp);
            t = i;
            j = 0;
            while(t<grid.length){
                grid[j][t] = temp.get(0);
                temp.remove(0);
                t++;
                j++;
            }
        }
        return grid;
    }
}