class Solution {

    public boolean isValid(char[][] arr,int row,int col,char val){
        for(int i=0;i<arr.length;i++){
            if(arr[row][i]==val){
                return false;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i][col]==val){
                return false;
            }
        }

        int sr=(row/3) *3;
        int sc=(col/3) *3;

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(arr[sr+i][sc+j]==val){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean solve(char[][] arr,int row,int col){
        if(row==arr.length){
            return true;
        }
        int nrow=0;
        int ncol=0;
        if(col==arr.length-1){
            nrow=row+1;
            ncol=0;
        }
        else{
            nrow=row;
            ncol=col+1;
        }

        if(arr[row][col]!='.'){
            if(solve(arr,nrow,ncol)){
                return true;
            }
        }
        else{
            for(char val='1';val<='9';val++){
                if(isValid(arr,row,col,val)){
                    arr[row][col]=val;
                    if(solve(arr,nrow,ncol)){
                        return true;
                    }
                    else{
                        arr[row][col]='.';
                    }
                }
            }
        }
        return false;
    }
    public void solveSudoku(char[][] board) {
        solve(board,0,0);
    }
} 