class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int top = 0;
        int bottom = matrix.length-1;
        int right = matrix[0].length-1;
        int left = 0;
        while(top<=bottom && right>=left){
            if(matrix[top][right] == target){
                return true;
            }
            else if(matrix[top][right]>target){
                right--;
            }
            else{
                top++;
            }
        }   
        return false;
    }
}