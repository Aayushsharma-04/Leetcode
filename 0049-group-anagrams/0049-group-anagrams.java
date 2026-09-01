class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i =0 ; i <strs.length;i++){
            String s = strs[i];
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sh = new String(ch);
            if(!map.containsKey(sh)){
                map.put(sh,new ArrayList<>());
               
            } 
            map.get(sh).add(s);
        }

         return new ArrayList<>(map.values()); 
      
    }
}