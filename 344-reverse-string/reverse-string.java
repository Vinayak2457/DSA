class Solution {
    public void reverseString(char[] s) {
         helper(s,0);
    }
    public void helper(char[] s,int index){
         if(index==s.length/2){
            return;
         }
         char temp=s[index];
         s[index]=s[s.length-1-index];
         s[s.length-1-index]=temp;
         helper(s,index+1);
    }
}