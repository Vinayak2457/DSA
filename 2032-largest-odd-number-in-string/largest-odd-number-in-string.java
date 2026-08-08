class Solution {
    public String largestOddNumber(String nums) {
        StringBuilder ans=new StringBuilder("");
        int i=nums.length()-1;
        while(i>=0){
            if((nums.charAt(i)-'0')%2!=0 ||nums.charAt(i)=='1' ){
                for(int j=0;j<=i;j++){
                    ans.append(nums.charAt(j));
                }
                return ans.toString();
            }
            i--;
        }
        return ans.toString();
    }
}