class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> neg=new  ArrayList<>();
        List<Integer> pos=new  ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                pos.add(nums[i]);
            }
            else{
                neg.add(nums[i]);
            }
        }
        int i=0;
        int j=0,k=0;
        while(i<nums.length){
            if(j<pos.size())
            nums[i++]=pos.get(j++);
            if(k<neg.size())
            nums[i++]=neg.get(k++);
        }return nums;
    }
}