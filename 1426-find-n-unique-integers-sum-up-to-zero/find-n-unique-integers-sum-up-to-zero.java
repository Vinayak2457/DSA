class Solution {
    public int[] sumZero(int n) {
        int[] ans=new int[n];
        for(int i=0;i<n/2;i++){
            ans[i]=i+1;
        }
        for(int i=n/2;i<n;i++){
            ans[i]=i-n;
        }
        if(n%2!=0) ans[n/2]=0;
        return ans;
    }
}