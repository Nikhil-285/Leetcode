class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int col=0;
        int row=matrix.length-1;
        while(col<matrix[0].length && row>=0){
            if(target==matrix[row][col]){
                return true;
            }else if(target<matrix[row][col]){
                row--;
            }else{
                col++;
            }
        }
        return false;
    }
}