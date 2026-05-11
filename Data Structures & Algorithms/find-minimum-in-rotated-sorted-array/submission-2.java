class Solution {
    public int findMin(int[] nums) {
               int left=0;
       int right=nums.length-1;
       int minVal=Integer.MAX_VALUE;
       while (left<=right){
           int mid=(left+right)/2;
           minVal=Math.min(minVal,nums[mid]);
           if(nums[mid]>=nums[right]){
               left=mid+1;
           }else{
               right=mid-1;
           }

       }
       return minVal;
    }
}
