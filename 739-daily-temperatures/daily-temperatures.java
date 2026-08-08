class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack();
        int n = temperatures.length;
        int ans[] = new int[n];
        int diff = 0;

        for(int i = 0; i<n; i++){
           
            while (!st.isEmpty() && temperatures[st.peek()] < temperatures[i]){
                int ind = st.pop();
                ans[ind] = i-ind;

            }
            st.push(i);
        }
        
        return ans;
    }
}