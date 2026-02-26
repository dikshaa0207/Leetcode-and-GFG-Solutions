class Solution {

    public int splitArray(int[] nums, int k) {

        int st = 0, end = 0;

        // Find search space
        for (int i = 0; i < nums.length; i++) {
            st = Math.max(st, nums[i]);   // maximum element
            end += nums[i];               // total sum
        }

        int res = -1;

        // Binary Search
        while (st <= end) {

            int mid = st + (end - st) / 2;

            if (valid(nums, mid, k)) {
                res = mid;
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }

        return res;
    }

    // Greedy check function
    public boolean valid(int[] nums, int mid, int k) {

        int sum = 0;
        int count = 1;   // at least one subarray

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            if (sum > mid) {
                count++;
                sum = nums[i];

                if (count > k) {
                    return false;
                }
            }
        }

        return true;
    }
}