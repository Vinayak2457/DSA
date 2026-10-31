class Solution {
    public int numberOfSteps(int num) {
        return helper(num,0);
    }
    public int helper(int num,int count){
        if(num==0) return count;
        if(num%2==0) {
            count++;
            num/=2;
        }
        else{
            num--;
            count++;
        }
        return helper(num,count);
    }
}