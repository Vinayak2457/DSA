class Solution {
    public int oddCells(int m, int n, int[][] indices) {

        int[] rows = new int[m];
        int[] cols = new int[n];

        for (int[] index : indices) {
            rows[index[0]]++;
            cols[index[1]]++;
        }

        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((rows[i] + cols[j]) % 2 != 0) {
                    count++;
                }
            }
        }

        return count;
    }
}
// class Solution {
//     public int oddCells(int m, int n, int[][] indices) {
//         int [][] ans=new int[m][n];
//         for(int i=0;i<indices.length;i++){
//             int a=indices[i][0];
//             int b=indices[i][1];
//             for(int j=0;j<n;j++){
//                 ans[a][j]+=1;
//             }
//             for(int k=0;k<m;k++){
//                 ans[k][b]+=1;
//             }
//         }
//         int count=0;
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 if(ans[i][j]%2!=0) count++;
//             }
//         }
//         return count;
//     }
// }