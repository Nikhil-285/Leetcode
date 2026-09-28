class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
       int m=grid.length;
       int n=grid[0].length;
       int i=m-1;
       int j=0;
       while(i>=0 && j<n){
        if(grid[i][j]<0){
            count+=n-j;//no need to check all elements in right will be negative
            i--;
        }else{
            j++;
        }
       }
        return count;
    }
}