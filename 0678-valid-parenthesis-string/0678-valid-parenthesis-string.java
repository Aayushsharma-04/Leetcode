class Solution {
    public boolean checkValidString(String s) {
        int cnt =0;
        int star =0;
      
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == '(')cnt++;
            else if(s.charAt(i) ==')') cnt--;
            else star++;
            if(star+cnt <0) return false;
        }
        cnt =0;
        star =0;
         for(int i =s.length() -1;i>=0;i--){
            if(s.charAt(i) == ')')cnt++;
            else if(s.charAt(i) =='(') cnt--;
            else star++;
            if(star+cnt <0) return false;
        }
       return true;
    }
}