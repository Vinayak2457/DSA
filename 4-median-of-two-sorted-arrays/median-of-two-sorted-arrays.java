class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length)
    return findMedianSortedArrays(nums2, nums1);
        int low=0,high=nums1.length;
        int k=(nums1.length+nums2.length+1)/2;
        while(low<=high){
            int cut1=(high+low)/2;
            int cut2=k-cut1;
            int l1=cut1>0?nums1[cut1-1]:Integer.MIN_VALUE;
            int l2=cut2>0?nums2[cut2-1]:Integer.MIN_VALUE;
            int r1=cut1<nums1.length?nums1[cut1]:Integer.MAX_VALUE;
            int r2=cut2<nums2.length?nums2[cut2]:Integer.MAX_VALUE;
            if(l1<=r2&& l2<=r1){
                if((nums1.length+nums2.length)%2==0){
                    return (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
                }
                else{
                    return l1>l2?l1:l2;
                }
            }
            if(l1>r2){
                  high=cut1-1;
            }
            else low=cut1+1;

        }
        return 0.0;

        // brute force 
        // int [] merged=new int[nums1.length+nums2.length];
        // int i=0,j=0,k=0;
        // int n=merged.length;
        // while(i < nums1.length && j < nums2.length){
        //     if( nums1[i]<nums2[j]){
        //         merged[k++]=nums1[i++];
        //     }
        //     else merged[k++]=nums2[j++];
        // }
        // while(i<nums1.length) merged[k++]=nums1[i++];
        // while(j<nums2.length) merged[k++]=nums2[j++];
        // if (n % 2 == 1)
        //     return merged[n / 2];

        // return (merged[n / 2] + merged[n / 2 - 1]) / 2.0;
    }
}