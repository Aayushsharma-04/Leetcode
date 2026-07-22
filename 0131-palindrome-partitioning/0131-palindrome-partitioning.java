class Solution {
    private boolean isPalindrome(String s ,int l,int r){
        while(l<r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
      
    }
    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        backtrack(0,s,new ArrayList<>(),list);
        return list;
    }
    private void backtrack(int i,String s,List<String> current,List<List<String>> list){
        if(i >= s.length()){
            list.add(new ArrayList<>(current));
            return;
        }
        for(int j =i;j<s.length();j++){
            if(isPalindrome(s,i,j)){
                current.add(s.substring(i,j+1));
                backtrack(j+1,s,current,list);
                current.remove(current.size() -1);
            }
        }
    }
}