class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<String,Integer> map = new HashMap<>();
        String[] words = s.split(" ");
        if(pattern.length() != words.length){
            return false;
        }
        for(String str : words){
            map.put(str,map.getOrDefault(str,0) +1);
        }
        int count = map.size();
        HashSet<Character> charSet = new HashSet<>();
        for (int i = 0; i < pattern.length(); i++) {
            charSet.add(pattern.charAt(i));
        }
        int uniqueChars = charSet.size();
          if (count != uniqueChars) {
            return false;
        }
        HashMap<Character, String> map1 = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String w = words[i];
            if (map1.containsKey(c)) {
                if (!map1.get(c).equals(w)) {
                    return false;
                }
            } else {
                map1.put(c, w);
            }
        }
       
       
        
       return true;

    }
}