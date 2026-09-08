class Solution {
    public boolean find(int[][] matrix, int target, int row, int col){
        int m = matrix.length;
        int n = matrix[0].length;

        while(row<matrix.length &&  col>=0){
                if(matrix[row][col] == target){
                    return true;
                } else if(matrix[row][col] < target){
                    row++;
                } else{
                    col--;
                }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {

        boolean a = find(matrix,target,0,matrix[0].length-1);

        return a;
    }
}