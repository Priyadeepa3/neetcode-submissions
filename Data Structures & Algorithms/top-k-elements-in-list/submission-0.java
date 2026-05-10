class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer>map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        List<HashMap.Entry<Integer,Integer>> list =  new ArrayList<>(map.entrySet());

        list.sort((a,b) -> b.getValue() - a.getValue());

        int [] finall = new int[k];

        for(int i = 0; i< k; i++){
            finall[i] = list.get(i).getKey();
        }
        return finall;
        
    }
}
