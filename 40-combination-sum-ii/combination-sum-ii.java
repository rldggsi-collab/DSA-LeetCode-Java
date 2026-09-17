class Solution {
    public void comb(int[] candidates, int target, List<List<Integer>> list,List<Integer> re, int n, int ind){
        
            if(target==0){
                list.add(new ArrayList<>(re));
                return;
            }
            
        
        for(int j = ind; j<n; j++){
            if(j>ind && candidates[j] == candidates[j-1]) continue;
            if(candidates[j]> target) break;
            re.add(candidates[j]);
            comb(candidates,target-candidates[j],list,re,n,j+1);
            re.remove(re.size()-1);
        
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        int n = candidates.length;
        int ind = 0;
        List<Integer> re = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        comb(candidates,target,list,re,n,0);
        return list;
    }
}