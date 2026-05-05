class Solution {
    public int search(int[] nums, int target) {
         int left=0;
        int right=nums.length-1;
        while (left<=right){
            int mid=(left+right)/2;
            if(target==nums[mid]){
                return mid;
            }
            if(nums[mid]>=nums[right]){
                if(target<=nums[right] || target>nums[mid]){
                    left=mid+1;

                }else{
                    right=mid-1;
                }
            }else{

                if(target > nums[mid] && target <= nums[right]){
                    left = mid+1;  // go right into sorted portion
                } else {
                    right = mid-1; // go left
                }

            }
        }
        return -1;
    }
}
