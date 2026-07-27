class Solution {
    public int hammingWeight(int n) {
        StringBuilder ans = new StringBuilder();
        while(n >0){
             ans.append(String.valueOf(n %2));
            n/=2;
        }
        int count =0;
        for(int i =0 ; i<ans.length();i++){
            if(ans.charAt(i) =='1'){
                count++;
            }
        }
        return count;
    }
}