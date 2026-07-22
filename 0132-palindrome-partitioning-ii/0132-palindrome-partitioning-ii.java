class Solution {
    private boolean isPalindrome(String s ,int l,int r){
        while(l<r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
    public int minCut(String s) {
        int []dp = new int[s.length() +1];
        Arrays.fill(dp,-1);
        return backtrack( s, 0, dp) -1;
       
    }
    private int backtrack(String s,int i, int[]dp){
        if(i>= s.length()){
             return 0;
        }
        if(dp[i] != -1) return dp[i];
        int mincut = Integer.MAX_VALUE;
        for(int j =i ;j<s.length();j++){
            if(isPalindrome(s,i,j)){
                mincut = Math.min(mincut, 1+backtrack(s,j+1,dp));
            }
        }
        return dp[i] = mincut;
    }

}