class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans=new StringBuilder("");
        int i;
        int j;
        char ch;
        boolean flag=true;
        int min=Integer.MAX_VALUE;
        for(int k=0;k<strs.length;k++){
            min=Math.min(min,strs[k].length());
        }
        for( i=0;i<min;i++){
             ch=strs[0].charAt(i);
             for( j=1;j<strs.length;j++){
                if(strs[j].charAt(i)!=ch){
                    flag=false;
                }
             }
             if(flag==true) ans.append(ch);
             else return ans.toString();
        }
        return ans.toString();
    }
}