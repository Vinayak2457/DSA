class Solution {
    public int reversePairs(int[] nums) {
        return mergesort(nums,0,nums.length-1);
    }
    public int mergesort(int[] nums,int low,int high){
        if(low>=high) return 0;
        int mid=low+(high-low)/2;
        int left=mergesort(nums,low,mid);
        int right=mergesort(nums,mid+1,high);
        int count=countpairs(nums,low,mid,high);
        merge(nums,low,mid,high);
        return count+left+right;
    }
    public int countpairs(int[] nums,int low,int mid,int high){
        int j=mid+1;
        int count=0;
        for(int i=low;i<=mid;i++ ){
            while(j<=high && (long)nums[i]>2L*nums[j]){
                j++;
            }
            count+=j-mid-1;
        }
        return count;
    }
    public void merge(int[] nums,int low,int mid,int high){
        int [] temp=new int[high-low+1];
        int i=low;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=high){
            if(nums[i]>nums[j]){
                temp[k++]=nums[j++];
            }
            else{
                temp[k++]=nums[i++];
            }

        }
        while(i<=mid){
            temp[k++]=nums[i++];
        }
        while(j<=high){
            temp[k++]=nums[j++];
        }
        for(int p=low;p<=high;p++){
           nums[p]=temp[p-low];
        }
    }
}