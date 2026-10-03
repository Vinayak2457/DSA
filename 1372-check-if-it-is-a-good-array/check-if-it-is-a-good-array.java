class Solution {
    public boolean isGoodArray(int[] nums) {

        int result = nums[0];
        if (nums.length == 1) {
               return nums[0] == 1;
}

        for(int i = 1; i < nums.length; i++) {
            result = gcd(result, nums[i]);

            if(result == 1) {
                return true;
            }
        }

        return false;
    }

    public int gcd(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}