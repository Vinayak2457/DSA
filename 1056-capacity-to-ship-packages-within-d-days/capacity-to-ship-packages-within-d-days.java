class Solution {
    public int shipWithinDays(int[] nums, int days) {
        int low=nums[0],high=nums[0];
        int ans=-1;
        for(int i=1;i<nums.length;i++){
            low = Math.max(low, nums[i]);
            high+=nums[i];
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            int count=0,n=1;
            for(int i=0;i<nums.length;i++){
                if(count<=mid)
                   count+=nums[i];
               if(count>mid){
                  n++;
                  count=nums[i];
               }
            }
            if(n<=days){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
                   }return ans;
    }
}