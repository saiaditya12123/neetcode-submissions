class Solution {
    public int longestConsecutive(int[] nums) {
            int maxFreq = 0;

        Set<Integer> hashSet=new HashSet<>();
        for(int i=0;i<=nums.length-1;i++){
           hashSet.add(nums[i]);

        }

        for(int i=0;i<=nums.length-1;i++){
            if(!hashSet.contains(nums[i]-1)){

                int count=1;
                int num=nums[i];
                while(hashSet.contains(num+1)){
                    num++;
                    count++;
                    
                }
                
                maxFreq=Math.max(maxFreq, count);


            }
        }
        
        return maxFreq;
    }
}
