class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> ans=new ArrayList<>();
        int carry=1,sum=0;
        for(int i=digits.length-1;i>=0;i--){
            sum = digits[i] + carry;
            if (sum == 10) {
                ans.add(0);
                carry = 1;
            } else {
                ans.add(sum);
                carry = 0;
            }            
        }
        if(carry==1){
            ans.add(1);
        }
        int[] a=new int[ans.size()];
        for(int i=0;i<a.length;i++){
            a[i]=ans.get(ans.size()-1-i);
        }
        return a;
    }
}