class Solution {
    public int maximumLengthSubstring(String s) {
        int maxlen = 0;
        int left = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0) + 1);
            while (map.get(c) > 2) {
                char ch = s.charAt(left);
                map.put(ch, map.get(ch) - 1);
                left++;
            }
            maxlen = Math.max(maxlen, right  - left +1);
        }
        return maxlen;
    }
}