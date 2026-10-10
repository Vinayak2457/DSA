class Solution {
    public int[][] generateMatrix(int n) {
        int [] arr=new int[n*n];
        for(int i=1;i<=n*n;i++){
            arr[i-1]=i;
        }
        int[][] ans=new int[n][n];
        int left=0,right=n-1,top=0,bottom=n-1;
        int count=0;
        while(count<n*n && top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                ans[top][i]=arr[count++];
            } top++;
            for(int i=top;i<=bottom;i++){
                ans[i][right]=arr[count++];
            }right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    ans[bottom][i]=arr[count++];
                }bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    ans[i][left]=arr[count++];
                }left++;
            }
        }
        return ans;
    }
}