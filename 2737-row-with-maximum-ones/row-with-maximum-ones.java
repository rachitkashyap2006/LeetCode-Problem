class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {

        int row = mat.length;
        int cols = mat[0].length;

        int maxCount = 0;
        int maxRow = 0;

        // int [] max = {count,row};

        for(int i = 0; i<row; i++){
            int count = 0;
            for(int j=0; j<cols; j++){
                if(mat[i][j]==1){
                    count++;
                }
            }

            if(count>maxCount){
                maxCount = count;
                maxRow = i;
            }
        }
        return new int[]{maxRow, maxCount};
    }
}