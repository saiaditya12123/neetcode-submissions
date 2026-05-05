class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
                int rLow=0;
        int rHigh=matrix.length-1;
        while (rLow<=rHigh) {
            int rmid=(rLow+rHigh)/2;
           int ilow=0;
           int ihigh=matrix[rmid].length-1;
           if(matrix[rmid][ilow] >target && matrix[rmid][ihigh]>target){
            rHigh=rmid-1;
           }else if(matrix[rmid][ilow]<target && matrix[rmid][ihigh]<target){
            rLow=rmid+1;
           }else{
            while (ilow<=ihigh) {
                int mid=(ilow+ihigh)/2;
                if(matrix[rmid][mid]>target){
                    ihigh=mid-1;
                }else if(matrix[rmid][mid]<target){
                    ilow=mid+1;
                }else{
                    return true;
                }
                
            }
            break;
           }
            
        }
        return false;
    }
}
