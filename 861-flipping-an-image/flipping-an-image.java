class Solution {
    public int[][] flipAndInvertImage(int[][] image){
        int m=image.length;
        int n=image[0].length;
        for(int i=0;i<m;i++){
            reverse(image,i,n);
            invert(image,i,n);
        }
        return image;
    }
    public void reverse(int [][] image,int row,int n){
        for(int j=0;j<n/2;j++){
            int temp=image[row][j];
            image[row][j]=image[row][n-j-1];
            image[row][n-j-1]=temp;
        }
    }
    public void invert(int[][] image,int row,int n){
        for(int j=0;j<n;j++){
            if(image[row][j]==0){
                image[row][j]=1;
            }
            else image[row][j]=0;
        }
    }
}