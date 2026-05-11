class Solution {
    public int minEatingSpeed(int[] piles, int h) {
                int maxPile=piles[0];
        int mink=0;
        for(int i=0;i<=piles.length-1;i++){
            if(piles[i]>maxPile){
                maxPile=piles[i];
            }
        }
        int left=1;
        int right=maxPile;
        while (left<=right){
           int mid=(left+right)/2;
           int totalHours=0;
           for(int j=0;j<=piles.length-1;j++){
              totalHours+= (piles[j] + mid - 1) / mid;
           }
           if(totalHours>h){
               left=mid+1;

           }else {
               mink=mid;
               right=mid-1;
           }

        }
       return mink;
    }
}
