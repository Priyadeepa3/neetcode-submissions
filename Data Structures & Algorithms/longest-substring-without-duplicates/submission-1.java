class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashSet<Character> map = new HashSet<>();

        int l = 0; // Left pointer
        int res = 0; // Resulting max length

        for(int i = 0; i<s.length(); i++){
           while (map.contains(s.charAt(i))) {
                map.remove(s.charAt(l));
                l++;
            }
            // Add the current character and update max length
            map.add(s.charAt(i));
           res = Math.max(res, map.size());
           
        }
        return res;
       

    }
}
