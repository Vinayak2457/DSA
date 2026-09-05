class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
         generate(ans,new ArrayList<>(),candidates,target,0,0);
         return ans;
    }
    private void generate(List<List<Integer>> ans,List<Integer> curr,int[] candidates,int target,int sum,int index){
        if(index==candidates.length || sum>target) return;
        if(sum==target){
            ans.add(new ArrayList<>(curr));
            return;
        }
         //include
        curr.add(candidates[index]);
        sum+=candidates[index];
        generate(ans,curr,candidates,target,sum,index);
        //exclude
        curr.remove(curr.size()-1);
        sum-=candidates[index];
        generate(ans,curr,candidates,target,sum,index+1);
    }
}