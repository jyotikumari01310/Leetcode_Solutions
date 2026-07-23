class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> st= new Stack<>();
        for(String s : operations){

            if(s.equals("C")){
                st.pop();
            }

            else if(s.equals("D")){
                st.push(st.peek()*2);

            }

            else if(s.equals("+")){
                int first=st.pop();
                int sec=st.peek();

                st.push(first);
                st.push(first+sec);
            }

            else{
                st.push(Integer.parseInt(s));

            }

            

        }

        int sum=0;

            while(!st.isEmpty()){
                sum=sum+st.pop();
            }

            return sum;
        
    }
}