class Solution {
    public int[] twoSum(int[] nums, int target) {
          Map<Integer,Integer> hashMap=new HashMap<>();
        int[] results=new int[2];
        for(int i=0;i<=nums.length-1;i++){
            if(hashMap.containsKey(target-nums[i])){
                results[0]=hashMap.get(target-nums[i]);
                results[1]=i;
                break;
            }else{
                hashMap.put(nums[i], i);
            }
        }
        return results; 
    }
}
