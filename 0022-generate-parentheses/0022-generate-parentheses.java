class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> answer = new ArrayList<>();
        StringBuilder ans = new StringBuilder();
        backtrack(n,0,0, answer,ans);
        return answer;
    }
    private List<String> backtrack(int n ,int open,int close,List<String>answer ,StringBuilder ans){
        if(open == close && close ==n){
            answer.add(ans.toString());
            return answer;
        }
        if(open < n){
            ans.append("(");
            backtrack(n,open +1,close,answer,ans);
            ans.deleteCharAt(ans.length() -1);
        }
        if(close <open){
            ans.append(")");
            backtrack(n,open,close+1,answer,ans);
            ans.deleteCharAt(ans.length() -1);
        }
        return answer;

    }
}