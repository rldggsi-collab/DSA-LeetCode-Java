class Solution {
    public int peak1(int[] arr, int low, int high){
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] > arr[mid+1]){
               high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int fir = peak1(arr,0,n-1);
        
        return fir;
    }
}