class Solution {
    public void Gen(int n,List<String> ans,int op, int col,StringBuilder curr){
        if(curr.length()==2*n){
            ans.add(curr.toString());
            return;
        }

        if(op < n){
            curr.append('(');
            Gen(n,ans,op+1,col,curr);
            curr.deleteCharAt(curr.length()-1);
        }
        if(col<op){
            curr.append(')');
            Gen(n,ans,op,col+1,curr);
            curr.deleteCharAt(curr.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        Gen(n,ans,0,0,new StringBuilder());
        return ans;
    }
}