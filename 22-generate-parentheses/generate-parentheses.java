class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        generate(ans,"",0,0,n);
        return ans;
    }
    private void generate(List<String> ans,String s,int count1,int count2,int n){
        if(count1==n && count1==count2 && s.length()==n*2){
            ans.add(s);
            return ;
        }
        if(s.length()==0 || count1<n){
            generate(ans,s+"(",count1+1,count2,n);
        }
        if(count1>count2){
            generate(ans,s+")",count1,count2+1,n);
        }

        
    }
}