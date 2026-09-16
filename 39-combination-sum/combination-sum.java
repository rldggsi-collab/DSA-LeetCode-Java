class Solution {
    public void comb(int []candidates, int target, List<List<Integer>> re, List<Integer> list, int i, int n){
        if(i==n){
            if(target == 0){
                re.add(new ArrayList<>(list));
            }
            return;
        }
        if(candidates[i]<=target){
            
            list.add(candidates[i]);
            comb(candidates,target-candidates[i], re, list, i, n);
            list.remove(list.size()-1);
        }

        comb(candidates,target, re, list, i+1, n);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n = candidates.length;
        int i = 0;
        List<List<Integer>> re = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        comb(candidates,target, re, list, i, n);
        return re;
    }
}