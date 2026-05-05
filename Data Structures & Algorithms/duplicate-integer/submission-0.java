class Solution {
    public boolean hasDuplicate(int[] nums) {
 
        Map<Integer,Integer> hashMap=new HashMap<>();
        for(int i=0;i<=nums.length-1;i++){
            if(hashMap.containsKey(nums[i])){
                return true;
            }
            hashMap.put(nums[i], i);
        }
        return false;
    }
}
