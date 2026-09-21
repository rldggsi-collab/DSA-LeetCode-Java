class Solution {
    public void sub(int[] nums,List<Integer> list,List<List<Integer>> res,int i, int n){
        if(i>=n){
            res.add(new ArrayList<>(list));
            return; 
        }

        list.add(nums[i]);
        sub(nums,list,res,i+1,n);
        list.remove(list.size()-1);

        sub(nums,list,res,i+1,n);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;

        sub(nums,list,res,0,n);
        return res;

    }
}