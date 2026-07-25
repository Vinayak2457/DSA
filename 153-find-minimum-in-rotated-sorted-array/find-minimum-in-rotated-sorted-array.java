class Solution {
    public int findMin(int[] nums) {
        int low = 0, high = nums.length - 1;
        int ans = nums[0];

        while (low <= high) {

            // Entire range is sorted
            if (nums[low] <= nums[high]) {
                ans = Math.min(ans, nums[low]);
                break;
            }

            int mid = low + (high - low) / 2;

            // Left half is sorted
            if (nums[low] <= nums[mid]) {
                ans = Math.min(ans, nums[low]);
                low = mid + 1;
            }
            // Right half is sorted
            else {
                ans = Math.min(ans, nums[mid]);
                high = mid - 1;
            }
        }

        return ans;
    }
}