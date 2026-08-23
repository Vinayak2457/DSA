class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n=mat[0].length;
        int m=mat.length;
        int low=0,high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int maxrow=0;
            for(int i=1;i<m;i++){
                if(mat[i][mid]>mat[maxrow][mid]){
                    maxrow=i;
                }
            }
            int left=(mid>0)?mat[maxrow][mid-1]:-1;
            int right=(mid<n-1)?mat[maxrow][mid+1]:-1;
            if(mat[maxrow][mid]>right && mat[maxrow][mid]>left){
                return new int[]{maxrow,mid};
            }
            else if(mat[maxrow][mid]>left){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
}