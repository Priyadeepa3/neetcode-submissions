class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> map = new HashMap<>();

        for(String str : strs){
            char [] ch = str.toCharArray();

            Arrays.sort(ch);

            String sorting = new String(ch);

            if(!map.containsKey(sorting)){
                map.put(sorting,new ArrayList<>());
            }

            map.get(sorting).add(str);
        }
        return new ArrayList<>(map.values());
        
    }
}
