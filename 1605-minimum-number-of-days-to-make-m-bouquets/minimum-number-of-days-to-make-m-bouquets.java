class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length<m*k) return -1;
        int low=1,high=bloomDay[0];
        int ans=-1;
        for(int i=0;i<bloomDay.length;i++){
            high=Math.max(bloomDay[i],high);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            int count=0,max=0,n=0;
            for(int i=0;i<bloomDay.length;i++){
                if (bloomDay[i] <= mid) {
                   count++;
                } else {
                     n += count / k;
                     count = 0;
                } 
            } n+=count/k;
            if(n<m){
               low=mid+1;
            }
            else {
                ans=mid;
                high=mid-1;
            }

        }
         return ans;
    }
}