class Solution {
    public void per(int[] nums,List<Integer> list,List<List<Integer>> res,boolean freq[],int n){
        if(list.size() == n){
            res.add(new ArrayList<>(list));
            return;
        } 

        for(int i = 0;i<n;i++){
            if(!freq[i]){
                list.add(nums[i]);
                freq[i] = true;
                per(nums,list,res,freq,n);
                list.remove(list.size()-1);
                freq[i] = false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();

        int n = nums.length;
        boolean freq[] = new boolean[n];
        per(nums,list,res,freq,n);
        return res;
    }
}