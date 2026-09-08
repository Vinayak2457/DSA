class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        generate(ans,new ArrayList<>(),0,nums);
        return ans;
    }
    private void generate(List<List<Integer>> ans,List<Integer> curr,int index,int[] nums){
        ans.add(new ArrayList<>(curr));
        for(int i=index;i<nums.length;i++){
            if(i>index && nums[i]==nums[i-1]){
                continue;
            }
            curr.add(nums[i]);
            generate(ans,curr,i+1,nums);
            curr.remove(curr.size()-1);
        }
    }
}