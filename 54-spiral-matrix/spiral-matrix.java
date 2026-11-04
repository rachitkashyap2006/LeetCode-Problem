class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int srow = 0;
        int scol = 0;
        int erow = m-1;
        int ecol = n-1;

        ArrayList<Integer> arr = new ArrayList<>();

        while(scol<=ecol && srow<=erow){
            //TOP LEFT TO RIGHT
            for(int col=scol; col<=ecol; col++){
                arr.add(matrix[srow][col]);
            }
            //RIGHT TOP TO BOTTOM
            for(int row=srow+1; row<=erow; row++){
                arr.add(matrix[row][ecol]);
            }
            //BOTTOM RIGHT TO LEFT
            for(int col=ecol-1; col>=scol; col--){
                if(srow==erow){
                    break;
                }
                arr.add(matrix[erow][col]);
            }
            //LEFT BOTTOM TO TOP
            for(int row=erow-1; row>=srow+1; row--){
                  if(scol==ecol){
                    break;
                }
                arr.add(matrix[row][scol]);
            }
            srow++;
            erow--;
            scol++;
            ecol--;
        }

        return arr;
        
    }
}