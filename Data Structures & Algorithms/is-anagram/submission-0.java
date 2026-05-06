class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap <Character , Integer> map = new HashMap<>();
       
       for(char ch : s.toCharArray()){
        map.put(ch,map.getOrDefault(ch,0)+1);
       }

       for(char ct : t.toCharArray()){

        if(!map.containsKey(ct)){
            return false;
        }

        map.put(ct, map.get(ct) -1);

        if(map.get(ct)==0){
            map.remove(ct);
        }
       }

        return map.isEmpty();
       }
    

}