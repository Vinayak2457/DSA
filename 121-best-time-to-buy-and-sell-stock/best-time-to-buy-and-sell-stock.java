class Solution {
    public int maxProfit(int[] nums) {
       int current =nums[0];
       int maxprofit=0;
       for(int i=1;i<nums.length;i++){
          current=Math.min(current,nums[i]);
          int profit=nums[i]-current;
          maxprofit=Math.max(maxprofit,profit);
       }return maxprofit;
    }
}