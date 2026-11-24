class NumMatrix {
    int [][] prefix;
    public NumMatrix(int[][] arr) {
        int rows = arr.length;
        int columns = arr[0].length;
        prefix = new int[rows+1][columns+1];

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=columns;j++){
               prefix[i][j] = arr[i-1][j-1]+prefix[i-1][j]+prefix[i][j-1]-prefix[i-1][j-1];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = prefix[row2+1][col2+1]-prefix[row1][col2+1]-prefix[row2+1][col1]+prefix[row1][col1];
        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */