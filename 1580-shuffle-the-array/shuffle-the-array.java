class Solution {
    public int[] shuffle(int[] nums, int n) {
       int[] ans=new int[2*n];
       int i=0,j=n;
       int k=0;
       while(j<nums.length){
          if(k%2==0){
            ans[k]=nums[i];
            k++;
            i++;
          }
          else{
            ans[k]=nums[j];
            k++;
            j++;
          }
       }
       return ans;
    }
}