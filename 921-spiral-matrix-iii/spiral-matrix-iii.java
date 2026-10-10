class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] ans=new int[rows*cols][2];
        int a=rStart,b=cStart;
        int count=0;
        ans[0][0]=a;
        ans[0][1]=b;
        int k=1;
        int i=1;
        while(k<=rows*cols-1){
            //left->right 
            for(int j=0;j<i;j++){
                b=b+1;
                if(a >= 0 && a < rows && b >= 0 && b < cols){ 
                    ans[k][0]=a;
                    ans[k][1]=b;
                    k++;
                } 
            }
            
            //top->bottom 
            for(int j=0;j<i;j++){
                a=a+1;
                if (a >= 0 && a < rows && b >= 0 && b < cols){
                ans[k][0]=a;
                ans[k][1]=b;
                k++;
            }
            } i++;
            //left->right
            for(int j=0;j<i;j++){
                 b-=1;
                if (a >= 0 && a < rows && b >= 0 && b < cols){
                    ans[k][0]=a;
                    ans[k][1]=b;
                    k++;
                }
            }
            //bottom ->top
            for(int j=0;j<i;j++){
                 a-=1;
                if (a >= 0 && a < rows && b >= 0 && b < cols){
                    ans[k][0]=a;
                    ans[k][1]=b;
                    k++;
                   
                }
            } i++;
        }
        return ans;
    }
}