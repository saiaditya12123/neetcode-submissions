class Solution {
    public int trap(int[] height) {
              int[] prefixMax=new int[height.length];
        int[] suffixMax=new int[height.length];
        int trappedWater=0;
        prefixMax[0]=height[0];
        suffixMax[height.length-1]=height[height.length-1];

        for(int i=1;i<=height.length-1;i++){
            prefixMax[i]=Math.max(prefixMax[i-1], height[i]);
        }

        for(int j=height.length-2;j>=0;j--){
             suffixMax[j]=Math.max(suffixMax[j+1], height[j]);
        }

       for(int k=0;k<=height.length-1;k++){
         trappedWater+=Math.min(prefixMax[k], suffixMax[k])-height[k];
       }

        return trappedWater;  
    }
}
