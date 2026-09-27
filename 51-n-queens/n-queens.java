class Solution {
    public boolean safe(int n ,char board[][], int row, int col){
        int uprow = row;
        int upcol = col;

        while(row>=0 && col>=0){
            if(board[row][col] == 'Q') return false;
            row--;
            col--;
        }

        row = uprow;
        col = upcol;
        while(col>=0){
            if(board[row][col] == 'Q') return false;
            col--;
        }

        row = uprow;
        col = upcol;
        while(row<n && col>=0){
            if(board[row][col] == 'Q') return false;
            row++;
            col--;
        }
        return true;
    }
    public void queen(int n, char board[][], List<List<String>> res, int col){
        if(col == n){
            List<String> temp = new ArrayList<>();
            for(int i = 0; i<n;i++){
                temp.add(new String(board[i]));
            }
            res.add(temp);
            return;
        }

        for(int row = 0; row<n; row++){
            if(safe(n,board,row,col)){
                board[row][col] = 'Q';
                queen(n,board,res,col+1);
                board[row][col] = '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        char board[][] = new char[n][n];
        List<List<String>> res = new ArrayList<>();
        for(int i = 0; i<n; i++){
           Arrays.fill(board[i],'.');
        }
        queen(n,board,res,0);
        return res;
    }
}