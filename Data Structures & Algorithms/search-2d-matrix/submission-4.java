class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
                int rlow=0;

        while (rlow<=matrix.length-1){
            int ilow=0;
            int ihigh=matrix[rlow].length-1;
            if(matrix[rlow][ilow]<=target && matrix[rlow][ihigh]>=target){
                while (ilow<=ihigh){
                    int mid=(ilow+ihigh)/2;
                    if(matrix[rlow][mid]>target){
                        ihigh--;
                    }else if(matrix[rlow][mid]<target){
                        ilow++;
                    }else{
                        return true;
                    }

                }
            }
                rlow++;

        }
        return false;
    }
}
