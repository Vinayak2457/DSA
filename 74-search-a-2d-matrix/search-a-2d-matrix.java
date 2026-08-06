class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low=0,high=matrix.length-1;
        int row=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(matrix[mid][0]>target){
                high=mid-1;
            }
            else if(matrix[mid][matrix[0].length-1]<target){
                low=mid+1;
            }
            else {
                row=mid;
                break;
            }
        }
        if(row==-1) return false;
        
        int low1=0,high1=matrix[0].length-1;
        while(low1<=high1){
             int mid=(low1+high1)/2;
             if(matrix[row][mid]>target){
                 high1=mid-1;
             }
             else if(matrix[row][mid]<target){
                 low1=mid+1;
             }
             else
             return true;
        }return false;
    }
}