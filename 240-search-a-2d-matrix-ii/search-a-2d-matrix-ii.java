class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int totalRow = matrix.length;
        int totalCols = matrix[0].length;

        // int n = totalRows * totalCols;

        int row = 0;
        int cols = totalCols-1;
        while(row < totalRow && cols>=0){
            if(matrix[row][cols]==target){
                return true;
            }
            else if(matrix[row][cols]>target){
                cols--;
            }
            else{
                row++;
            }
        }
        return false;
    }
}