class Solution {
    public class pair{
        char ch;
        int num;

        pair(char ch, int num){
            this.ch = ch;
            this.num = num;
        }
    }
    public String removeDuplicates(String s, int k) {
        Stack<pair> st = new Stack<>();
        int n = s.length();
        int num = 1;

        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);

            if(st.isEmpty()){
                st.push(new pair(ch,num));
                continue;
            }

            if(st.peek().ch != ch){
                st.push(new pair(ch,num));
                continue;
            }

            if(st.peek().ch == ch && st.peek().num < (k-1)){
                pair p = st.peek();
                st.pop();
                st.push(new pair(p.ch,p.num+1));
                continue;
            }
            st.pop();
            
        }
        StringBuilder res = new StringBuilder();
        while(!st.isEmpty()){
            pair p = st.peek();
            st.pop();

            while(p.num>0){
                res.append(p.ch);
                p.num--;
            }
        }
        return res.reverse().toString();
    }
}