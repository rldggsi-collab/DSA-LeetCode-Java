class Solution {
    public int peak(int[] nums, int low, int high){
        
        while(low<high){
            int mid = (low+high)/2;
            if(nums[mid] > nums[high]){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        return low;
    }
    public int findMin(int[] nums) {
        int n = nums.length;
        int a = peak(nums, 0, n-1);
        int min = nums[a];

        return min;
    }
}