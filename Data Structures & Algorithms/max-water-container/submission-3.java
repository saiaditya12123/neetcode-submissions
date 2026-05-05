class Solution {
    public int maxArea(int[] heights) {
                int left=0;
        int right=heights.length-1;
        int maxArea=Integer.MIN_VALUE;
        while (left<right) {
            if(heights[left]>heights[right]){
                maxArea=Math.max(maxArea, (right-left)*Math.min(heights[left], heights[right]));
                right--;
            }else if(heights[right]>heights[left]){
                maxArea=Math.max(maxArea, (right-left)*Math.min(heights[left], heights[right]));
                left++;

            }else{
                maxArea=Math.max(maxArea, (right-left)*Math.min(heights[left], heights[right]));
                left++;
                right--;
            }

           



            
        }
        return maxArea;
    }
}
