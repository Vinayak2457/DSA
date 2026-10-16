class Solution {
    public int[] fairCandySwap(int[] nums1, int[] nums2) {
        int sum1=0,sum2=0;
        Set<Integer> ans=new HashSet<>();
        for(int num:nums1) sum1+=num;
        for(int num:nums2) {
            ans.add(num);
            sum2+=num;
        }   
        int diff=(sum2-sum1)/2;
        for(int i=0;i<nums1.length;i++){
            int target=nums1[i]+diff;
            if(ans.contains(target)){
                return new int[]{nums1[i],target};
            }
        }
        return new int[]{};
    }
}