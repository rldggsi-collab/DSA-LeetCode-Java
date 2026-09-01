class Solution {
    public int midCal(int[] nums, int target,int low, int high){
        if(low>high){
            return -1;
        }
        int mid=(low+high)/2;
         if(nums[mid] == target){
            return mid;
        }
        else if(nums[mid]>target){
            return midCal(nums,target,low,mid-1);
        }else {
            return midCal(nums,target,mid+1,high);
        }
    }
    public int search(int[] nums, int target) {
        int n = nums.length;
        return midCal(nums,target,0,n-1);
    }
}