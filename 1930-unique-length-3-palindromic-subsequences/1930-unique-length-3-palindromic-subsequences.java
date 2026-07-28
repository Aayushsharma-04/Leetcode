class Solution {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        int[] first = new int[26];
        int [] last = new int[26];
        Arrays.fill(first,-1);
        Arrays.fill(last,-1);
        for(int i =0;i<n;i++){
            int charidx = s.charAt(i) -'a';
            if(first[charidx] == -1){
                first[charidx] =i;
            }
            last[charidx] =i;
        }
        int palindromes = 0;
        for(int i =0;i<26;i++){
            if(first[i] != -1 && last[i] > first[i] +1){
                HashSet<Character> charm = new HashSet<>();
                for (int mid = first[i] + 1; mid < last[i]; mid++) {
                    charm.add(s.charAt(mid));
                }
                palindromes += charm.size();
            }
        }
        return palindromes;

    }
}