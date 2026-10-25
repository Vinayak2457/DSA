class Solution {
    public int splitArray(int[] nums, int k) {
        if(k>nums.length) return -1;
        long low=0,high=0;
        for(int i:nums){
            low=Math.max(i,low);
            high+=i;
        }
        long ans=high;
        while(low<=high){
            long mid=low+(high-low)/2;
            if(canplace(nums,k,mid)){
                 ans =mid;
                 high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return (int)ans;
    }
    public boolean canplace(int[] nums,int k,long mid){
        long sum=0;
        int count=1;
        for(int i:nums){
            if(i+sum>mid){
                sum=i;
                count++;
            }
            else{
                sum+=i;
            }
            if(count>k){
                return false;
            }
        }
        return true;
    }
}