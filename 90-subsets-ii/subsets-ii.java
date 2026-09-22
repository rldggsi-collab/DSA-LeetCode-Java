class Solution {
    public void sub(int[] nums,List<Integer> list,List<List<Integer>> res, int ind,int n){
        res.add(new ArrayList<>(list));
        if(ind>=n){
            return;
        }
        for(int i= ind;i<n;i++){
            if(i>ind && nums[i]==nums[i-1]) continue;
        list.add(nums[i]);
        sub(nums,list,res,i+1,n);
        list.remove(list.size()-1);

        
        }
        
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;

        sub(nums,list,res,0,n);
        return res;
    }
}