class Solution {
    public int peak(int[] nums, int target, int low, int high){
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] == target){
                return  mid;
            }
            else if(nums[low]>nums[mid]){
                if(nums[mid]<target && target<=nums[high]){
                    low = mid+1;
                } else{
                    high =  mid-1;
                }
            }
            else{
                if(nums[low]<=target && target<nums[mid]){
                high = mid-1;
                } else{
                    low = mid+1;
                }
            }
        }
            return -1;
    }
    public int search(int[] nums, int target) {
        int n = nums.length;
        int a= peak(nums,target,0,n-1);

        return a;
    }
}