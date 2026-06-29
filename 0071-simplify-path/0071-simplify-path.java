class Solution {

    public String simplifyPath(String path) {

        Stack<String> st = new Stack<>();

        String[] arr = path.split("/");

        for(String dir : arr){

            if(dir.equals("") || dir.equals("."))
                continue;

            if(dir.equals("..")){
                if(!st.isEmpty())
                    st.pop();
            }else{
                st.push(dir);
            }
        }

        StringBuilder ans = new StringBuilder();

        for(String s : st)
            ans.append("/").append(s);

        return ans.length()==0 ? "/" : ans.toString();
    }
}