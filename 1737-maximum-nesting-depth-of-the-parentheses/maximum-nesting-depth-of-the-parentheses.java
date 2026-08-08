class Solution {
    public int maxDepth(String s) {
        int max=0;
        int count=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                count++;
            }
            else if(ch==')'){
                max=Math.max(max,count);
                count--;
            }
        }
        return max;

    }
}