class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int totalRow = matrix.length;
        int totalCols = matrix[0].length;

        int n = totalRow*totalCols;  // total number of element 

        // 1-D ARRAY BINARY SEARCH

        int s = 0; 
        int e = n-1;

        while(s<=e){
            int mid = s+(e-s)/2;
            int rowIndex = mid/totalCols;
            int colsIndex = mid%totalCols;

            if(matrix[rowIndex][colsIndex] == target){
                return true;
            }
            else if(matrix[rowIndex][colsIndex] > target){
                e = mid -1;
            }
            else{
                s = mid + 1;  
            }


        }
        return false;
    }
}