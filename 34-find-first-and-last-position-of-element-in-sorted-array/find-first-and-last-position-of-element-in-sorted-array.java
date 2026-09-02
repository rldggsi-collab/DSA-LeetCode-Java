class Solution {
    public int first(int[] nums, int target, int low, int high){
        if(low>high){
            return -1;
        }
        int res = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] == target){
                res = mid;
                high = mid -1;
            }
            else if(nums[mid]<target){
                low = mid + 1;
            }
            else{
                high = mid-1;
            }
        }
        return res;
    }
    public int sec(int[] nums, int target, int low, int high){
         if(low>high){
            return -1;
        }
        int Sres = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] == target){
                Sres = mid;
                low = mid+1;
            }
            else if(nums[mid]<target){
                low = mid + 1;
            }
            else{
                high = mid-1;
            }
        }
        return Sres; 
    }
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int First = first(nums,target,0,n-1);
        int second = sec(nums,target,0,n-1);
        return new int[]{First,second};
    }
}