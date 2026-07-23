class Solution {
    public boolean backspaceCompare(String s, String t) {

        return build(s).equals(build(t));
        
    }

    private String build(String str){
        Stack<Character> st= new Stack<>();
        for(char ch: str.toCharArray()){
            if(ch !='#'){
                st.push(ch);

            }

            else if(!st.isEmpty()) st.pop();
        }

        StringBuilder sb= new StringBuilder();

        while(!st.isEmpty()){
            sb.append(st.pop());
        }

        return sb.toString();
    }
}