class Solution {
    public int[] twoSum(int[] nums, int target) {
        int low=0,high=nums.length-1;
        int sum=0;
        while(low<high){
            sum=nums[low]+nums[high];
            if(sum==target){
                return new int[]{low+1,high+1};
            }
            if( sum>target){
                high-=1;
            }
            else {
                low+=1;
            }
        }
        return new int[]{low,high};
    }
}