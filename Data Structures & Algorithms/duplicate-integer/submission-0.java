class Solution {
    public boolean hasDuplicate(int[] nums) {
    
     HashMap<Integer,Integer> map = new HashMap<>();

     for(int dup : nums){
        if(map.containsKey(dup)){
            return true;
        }
        
        map.put(dup,1);

        

     }
     return false;
   

    }
}