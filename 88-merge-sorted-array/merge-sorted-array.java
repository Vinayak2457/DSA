class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(i>=m && nums1[i]==0){
                nums1[i]=nums2[j];
                i++;
                j++;
                m++;
            }
            else if(i<nums1.length-1 && j<n &&nums1[i]<=nums2[j] ) i++;
            else {
                for(int k=nums1.length-1;k>i;k--){
                    nums1[k]=nums1[k-1];
                }
                if(i<nums1.length-1 && j<n)
                    nums1[i]=nums2[j];
                i++;
                j++;
                m++;
            }
        }
    }
}