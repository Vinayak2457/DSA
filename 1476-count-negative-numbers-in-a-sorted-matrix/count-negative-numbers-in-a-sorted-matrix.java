
class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int row = m - 1, col = 0;
        int count = 0;

        while (row >= 0 && col < n) {
            if (grid[row][col] < 0) {
                count += n - col;
                row--;
            } else {
                col++;
            }
        }

        return count;
    }
}

// class Solution {
//     public int countNegatives(int[][] grid) {
//         int count=0;
//         for(int i=0;i<grid.length;i++){
//             int low=0,high=grid[0].length-1;
//             while(low<=high){
//                 int mid=low+(high-low)/2;
//                 if(grid[i][mid]<0){
//                     high=mid-1;
//                 }
//                 else{
//                     low=mid+1;
//                 }
//             }
//             count+=(grid[0].length-low);
//         }
//         return count;
//     }
// }