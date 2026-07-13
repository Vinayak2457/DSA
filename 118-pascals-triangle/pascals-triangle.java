class Solution {
    public List<List<Integer>> generate(int numRows) {
        int [][] pascal=new int [numRows][numRows];
        for(int i=0;i<numRows;i++){
            pascal[i][0]=1;
            pascal[i][i]=1;
        }
        for(int i=2;i<numRows;i++){
            for(int j=1;j<i;j++){
                pascal[i][j]=pascal[i-1][j-1]+pascal[i-1][j];
            }
        }
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> l1=new ArrayList<>();
            for(int j=0;j<=i;j++){
                l1.add(pascal[i][j]);
            }
            list.add(l1);
        }return list;
    }
}