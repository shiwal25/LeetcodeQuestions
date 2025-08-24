class Solution {
    public void setZeroes(int[][] matrix) {
        boolean fr = false;
        boolean fc = false;
        for(int i=0;i<matrix[0].length;i++){
            if(matrix[0][i] == 0){
                fr = true;
                break;
            }
        }
        for(int j=0;j<matrix.length;j++){
            if(matrix[j][0] == 0){
                fc = true;
                break;
            }
        }
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[i].length;j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for(int i=1;i<matrix[0].length;i++){
            if(matrix[0][i] == 0){
                for(int j=0;j<matrix.length;j++){
                    matrix[j][i] = 0;
                }
            }
        }
        for(int i=1;i<matrix.length;i++){
            if(matrix[i][0] == 0){
                for(int j=0;j<matrix[i].length;j++){
                    matrix[i][j] = 0;
                }
            }
        }
        if(fr){
            for(int i=0;i<matrix[0].length;i++){
                matrix[0][i] = 0;
            }
        }
        if(fc){
            for(int i=0;i<matrix.length;i++){
                matrix[i][0] = 0;
            }
        }
    }
}