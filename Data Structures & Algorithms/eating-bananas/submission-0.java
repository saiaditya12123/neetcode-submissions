class Solution {
    public int minEatingSpeed(int[] piles, int h) {
                    int maxPile=piles[0];
        for(int i=0;i<=piles.length-1;i++){
            if(piles[i]>maxPile){
                maxPile=piles[i];
            }
        }
        int lowerBound=1;
        int k=0;
        while (lowerBound<=maxPile){
           int sum=0;
            int mid=(lowerBound+maxPile)/2;
            for(int j=0;j<=piles.length-1;j++){
               sum+=Math.ceil((double)piles[j]/mid);
            }
           if(sum<=h){

               k=mid;
               maxPile=mid-1;
           }else{
               lowerBound=mid+1;
           }

        }
        return k;
    }
}
