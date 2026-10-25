/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
      int low=0,high=mountainArr.length()-1;
      while(low<high){
          int mid=low+(high-low)/2;
          if(mountainArr.get(mid)<mountainArr.get(mid+1)){
             low=mid+1;
          }
          else{
            high=mid-1;
          }
      }
      int peak=low;
      low=0;
      high=peak;
      int ans1=-1;
      while(low<=high){
        int mid=low+(high-low)/2;
        if(mountainArr.get(mid)==target){
            ans1=mid;
            high=mid-1;
        }
        else if(mountainArr.get(mid)>target){
            high=mid-1;
        }
        else{
            low=mid+1;
        }
      }
         low=peak+1;
         high=mountainArr.length()-1;
      
      while(low<=high){
        int mid=low+(high-low)/2;
        if(mountainArr.get(mid)==target && ans1==-1){
             ans1=mid;
             low=mid+1;
        }
        else if(mountainArr.get(mid)<target){
            high=mid-1;
        }
        else{
            low=mid+1;
        }
      }
      return ans1;
    }
}