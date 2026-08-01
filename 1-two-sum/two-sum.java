class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> frq = new HashMap<>();
        int i = 0;
        int n = nums.length;
        for(i = 0; i<n; i++){
            int diff = target - nums[i];
            if(frq.containsKey(diff)){
                return new int[]{frq.get(diff),i};
            }
            frq.put(nums[i],i);
        }

        return new int[]{-1,-1};
    }
}