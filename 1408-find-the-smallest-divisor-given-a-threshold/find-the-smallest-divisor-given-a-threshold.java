class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1,high=nums[0];
        for(int i=1;i<nums.length;i++){
            high=Math.max(high,nums[i]);
        }int ans = Integer.MAX_VALUE;
        while(low<=high){
            int mid=low+(high-low)/2;
            int count=0;
            for(int i=0;i<nums.length;i++){
                count+=(nums[i]+mid-1)/mid;
            }
            if(count>threshold) low=mid+1;
            else{
                ans=Math.min(ans,mid);
                high=mid-1;
            }
        }
        return ans;
    }
}