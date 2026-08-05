class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack();

        for(int i = 0; i<s.length(); i++){
            char top = s.charAt(i);
            if(top == '(' || top == '[' || top == '{'){
                st.push(top);
                continue;
            }                           // why we are here bucause of the closing bracket;
            if(st.isEmpty()){           // for the closing brackets;
                return false;
            }
            
            char ch = st.pop(); 
             if(top == ')' && ch != '(' || top == ']' && ch != '[' || top == '}' && ch != '{'){
                return false;
            } 
        }
        if(st.isEmpty()){
            return true;
        }
        return false;
    }
}