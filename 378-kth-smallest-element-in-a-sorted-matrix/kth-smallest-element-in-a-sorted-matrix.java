class Solution {
    public int find(int[][] matrix, int k, int mid){
        int row = matrix.length-1;
        int col = 0;
        int count = 0;

        while(row>=0 && col<matrix[0].length){
            if(matrix[row][col]<=mid){
                count = count+row+1;
                col++;
            }
            else{
                row--;
            }
        }
         return count;
    }
    public int kthSmallest(int[][] matrix, int k) {
        int low = matrix[0][0];
        int high = matrix[matrix.length-1][matrix[0].length-1];
        int ans = 0;
        while(low<=high){
            int mid = (low+high)/2;
            int res = find(matrix,k,mid);

            if(res<k){
                low = mid+1;
            } else{
                ans = mid;
                high = mid-1;
            }
        }
         return ans;
    }
}