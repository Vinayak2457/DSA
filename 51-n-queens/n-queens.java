class Solution {
    public List<List<String>> solveNQueens(int n) {
         List<List<String>> ans=new ArrayList<>();
         char[][] board = new char[n][n];
          for (int i = 0; i < n; i++) {
             Arrays.fill(board[i], '.'); 
            }
         boolean[] col=new boolean[n];
         boolean[] diag1=new boolean[2*n-1];
         boolean[] diag2=new boolean[2*n-1];
         backtrack(ans,n,board,col,diag1,diag2,0);
        return ans;
    }
    public void backtrack(List<List<String>> ans,int n,char[][] board,boolean[] col,boolean[] diag1,boolean[] diag2,int row){
        if(row==n){
            List<String> curr=new ArrayList<>();
            for(int i=0;i<n;i++){
                curr.add(new String(board[i]));
            }
            ans.add(curr);
            return;
        }
        for(int i=0;i<n;i++){
            int d1 = row + i;
            int d2 = row - i + n - 1;
            if(col[i]||diag1[d1]||diag2[d2]){
                continue;
            }
            board[row][i]='Q';
            col[i]=true;
            diag1[d1]=true;
            diag2[d2]=true;
            backtrack(ans,n,board,col,diag1,diag2,row+1);
            board[row][i]='.';
            col[i]=false;
            diag1[d1]=false;
            diag2[d2]=false;
        }
    }
}
