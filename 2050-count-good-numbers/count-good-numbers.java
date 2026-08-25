class Solution {
    static final long MOD = 1000000007;
    public int countGoodNumbers(long n) {
        // the even places have 5 choices  0,2,4,6,8wheras odd ones has 4 choices 2,3,5,7
        long even =(n+1)/2; //no of even places
        long odd=n/2;//no of odd places
        return (int)(power(5,even)*power(4,odd)%MOD);
    }
    public long power(int x,long n){
        if(n==0) return 1;
        long half=power(x,n/2);
        if(n%2==0) return (half*half)%MOD;
        return (half*half*x)%MOD;
    }
}