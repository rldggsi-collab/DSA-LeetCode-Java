class Solution {
    public int find(int m, int n,int k, int mid){
        int row = m;
        int col = 1;
        int count = 0;

        while(row>=1 && col<=n){
            if(row*col<=mid){
                count = count+row;
                col++;
            } else{
                row--;
            }
        }
        return count;
    }
    public int findKthNumber(int m, int n, int k) {
        int low = 1;
        int high = m*n;
        int res = 0;

        while(low<=high){
            int mid = (low+high)/2;
            int ans = find(m,n,k,mid);
            if(ans<k){
                low = mid+1;
            } else{
                res = mid;
                high = mid-1;
            }
        }
        return res;
    }
}