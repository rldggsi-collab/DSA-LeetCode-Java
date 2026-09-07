class Solution {
    public boolean find(int[][] matrix, int target, int low, int high){
        int m = matrix.length;
        int n = matrix[0].length;

        while(low<=high){
            int mid = (low+high)/2;
            int row = mid / n;
            int col = mid%n;

           
                if(matrix[row][col] == target){
                    return true;
                } else if(matrix[row][col] < target){
                    low = mid+1;
                } else{
                    high = mid-1;
                }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean a = find(matrix,target,0,m*n-1);

        return a;
    }
}