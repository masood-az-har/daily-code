class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        
        int r = 0;
        int c = columns-1;

        while(r < rows && c >= 0){
            if(matrix[r][c] == target){
                return true;
            }

            if(matrix[r][c] > target){
                c--;
            }else{
                r++;
            }
        }
        return false;
    }
}