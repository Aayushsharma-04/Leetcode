import java.util.Stack;
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>st = new Stack<>();
        for(String s : operations){
            if(s.equals("C")){
                st.pop();
            }
             else if(s.equals("D")){
                st.push( 2 * st.peek());
            }
            else if(s.equals("+")){
                int last = st.pop();
                int secondlast = st.peek();
                st.push(last);
                st.push(last + secondlast);
            }
            else{
                int num = Integer.parseInt(s);
                st.push(num);
            }
        }
        int ans =0;
        while(!st.isEmpty()){
            ans += st.pop();
        }
        return ans;
    }
}