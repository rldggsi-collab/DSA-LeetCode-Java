class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack();
        int n = nums.length;
        int ans[] = new int[n];

        for(int i = 2*n-1; i>=0; i--){
            int curr = nums[i%n];
            if(st.isEmpty()){
                st.push(curr);
                continue;
            }
            while(!st.isEmpty() && st.peek()<=curr){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i%n] = -1;
            } else{
                ans[i%n] = st.peek();
            }
            st.push(curr);
        }
        return ans;
    }
}