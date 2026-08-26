class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int  n = s.length();
        int left =0;
        int ones =0;
        int minlen = n +1;
        int beststart = -1;
        for(int right =0 ;right < n;right++){
            if(s.charAt(right) == '1'){
                ones++;
            }

            while(ones ==k){
                int currentlen = right -left +1;
                if(currentlen < minlen){
                    minlen = currentlen;
                    beststart = left;
                }else if(currentlen == minlen){
                    if(s.substring(left,left+minlen).compareTo(s.substring(beststart,beststart+currentlen)) < 0){
                        beststart = left;
                    }
                }
                if(s.charAt(left) =='1'){
                    ones--;
                }
                left++;
            }
        }
        if(beststart == -1) return "";
        return s.substring(beststart,beststart+minlen);
    }
}