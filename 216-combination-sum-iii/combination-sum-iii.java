class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        int[] nums={1,2,3,4,5,6,7,8,9};
        generate(ans,new ArrayList<>(),k,n,nums,0,0);
        return ans;
    }
    private void generate(List<List<Integer>> ans,List<Integer> curr,int k,int n,int[] nums,int sum,int index){
        if(curr.size()==k ){
            if(sum==n)
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=index;i<nums.length;i++){
            if( sum+nums[i]<=n){
              curr.add(nums[i]);
              sum+=nums[i];
            generate(ans,curr,k,n,nums,sum,i+1); 
            curr.remove(curr.size()-1);
            sum-=nums[i];
            }   
        }
        
    }
}