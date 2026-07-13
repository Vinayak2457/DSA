class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       int[] ans=new int[matrix.length*matrix[0].length];
       int top=0;
       int k=0;
       int bottom=matrix.length-1;
       int left=0;
       int right=matrix[0].length-1;
       while(left<=right && top<=bottom ){
        //left->right
       for(int i=left;i<=right;i++){
          ans[k++]=matrix[top][i];
       }
       top++;
       // top->bottom
       for(int i=top;i<=bottom;i++){
          ans[k++]=matrix[i][right];
       }
       right--;
       // right->left
       if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans[k++]=matrix[bottom][i];
                }
                bottom--;
            }
       // bottom to top
        if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans[k++]=matrix[i][left];
                }
                left++;
            }
       }
       List<Integer> list=new ArrayList<>();
       for(int n:ans){
         list.add(n);
       }return list;
    }
}