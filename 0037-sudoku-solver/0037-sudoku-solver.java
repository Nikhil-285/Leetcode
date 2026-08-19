class Solution {
    public void solveSudoku(char[][] board) {
        if(SudokuSolver(board,0,0)){
            Print(board);
        }
    }
    public static boolean isSafe(char board[][],int row,int col,char digit){
        //for row
        for(int i=0;i<9;i++){
            if(board[i][col]==digit){
                return false;
            }
        }
        //for col
        for(int j=0;j<9;j++){
            if(board[row][j]==digit){
                return false;
            }
        }
        //for grid
        int startrow=(row/3)*3;
        int startcol=(col/3)*3;
        for(int i=startrow;i<startrow+3;i++){
            for(int j=startcol;j<startcol+3;j++){
                if(board[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean SudokuSolver(char board[][],int row,int col){
        //base case
        if(row==9){
            return true;
        }
        //recursion
        int nextrow=row;
        int nextcol=col+1;
        if(nextcol==9){
            nextrow=row+1;
            nextcol=0;
        }
        if(board[row][col]!='.'){
            return SudokuSolver(board,nextrow,nextcol);
        }
        for(char digit='1';digit<='9';digit++){
            if(isSafe(board,row,col,digit)){
            board[row][col]=digit;
            if(SudokuSolver(board,nextrow,nextcol)){
                return true;
            }
            board[row][col]='.';
        }
        
        }
        return false;
    }
    public static void Print(char board[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}