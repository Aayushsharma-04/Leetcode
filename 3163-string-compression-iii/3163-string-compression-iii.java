class Solution {
    public String compressedString(String word) {
        int count =1;
        StringBuilder sb = new StringBuilder();
        if(word == null || word.length() ==0) return "";
        
        for(int i =1;i < word.length();i++){
            if(word.charAt(i) == word.charAt(i -1) && count < 9) count++;
            else{
                sb.append(count).append(word.charAt(i-1));
                count =1;
            }
        }
        sb.append(count).append(word.charAt(word.length() -1));
        return sb.toString();
    }
}