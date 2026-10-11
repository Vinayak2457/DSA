class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n=(int)Math.pow(2,nums.length);
        List<List<Integer>> ans=new ArrayList<>();
        for(int x=0;x<n;x++){
            List<Integer> a=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                if((x&(1<<i))!=0){
                    a.add(nums[i]);
                }
            }
            ans.add(a);
        }
        return ans;
    }
}