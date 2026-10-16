class Solution {
    public int specialArray(int[] nums) {
        int max=0;
        for(int i:nums){
            max=Math.max(i,max);
        }
        int x=0;
        while(x<=nums.length ){
            int count=0;
              for(int i=0;i<nums.length;i++){
                   if(x<=nums[i]){
                    count++;
                   }
              }
              if(count==x){
                 return x;
              }
              x++;
        }
        return -1;
    }
}