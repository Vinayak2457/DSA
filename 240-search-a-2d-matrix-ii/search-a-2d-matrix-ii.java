class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {

            if (matrix[row][col] == target) {
                return true;
            }
            else if (matrix[row][col] > target) {
                col--;
            }
            else {
                row++;
            }
        }

        return false;
    }
}
// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         for(int i=0;i<matrix.length;i++){
//             if(matrix[i][matrix[i].length-1]<target ) continue;
//             int low=0,high=matrix[i].length-1;
//             while(low<=high){
//                 int mid=low+(high-low)/2;
//                 if(matrix[i][mid]==target){
//                     return true;
//                 }
//                 else if(matrix[i][mid]>target) high=mid-1;
//                 else low=mid+1;
//             }
//         }
//         return false;
//     }
// }