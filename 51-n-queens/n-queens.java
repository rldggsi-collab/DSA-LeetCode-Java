class Solution {
    public void Queen(int col,List<String> board,List<List<String>> ans,int leftrow[],int loDigonal[],int upDigonal[],int n){
        if(col==n){
            ans.add(new ArrayList<>(board));
            return;
        }

        for(int row = 0; row<n; row++){
            if(leftrow[row] == 0 && loDigonal[row+col] == 0 && upDigonal[n-1 + col-row]==0){
                char[] currRow = board.get(row).toCharArray();
                currRow[col] = 'Q';
                board.set(row,new String(currRow));

                leftrow[row] = 1;
                loDigonal[row+col] = 1;
                upDigonal[n-1 + col-row] = 1;

                Queen(col+1,board,ans,leftrow,loDigonal,upDigonal,n);

                char[] cuurrRow = board.get(row).toCharArray();
                currRow[col] = '.';
                board.set(row,new String(currRow));

                leftrow[row] = 0;
                loDigonal[row+col] = 0;
                upDigonal[n-1 + col-row] = 0;
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<String> board = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();

        for(int i = 0; i<n;i++){
            board.add(".".repeat(n));
        }
        int leftrow[] = new int[n];
        int loDigonal[] = new int[2*n-1];
        int upDigonal[] = new int[2*n-1];
        Queen(0,board,ans,leftrow,loDigonal,upDigonal,n);

        return ans; 
    }
}