class Solution {

    static int pivot(int[] nums) {

        int start = 0;
        int n = nums.length;
        int end = n - 1;

        if (nums[start] < nums[end]) {
            return -1;
        }

        int ans = 0;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] <= nums[n - 1]) {
                ans = mid;
                end = mid - 1;
            } 
            else {
                start = mid + 1;
            }
        }

        return ans;
    }

    static int binary(int[] nums, int start, int end, int target) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target == nums[mid]) {
                return mid;
            } 
            else if (target > nums[mid]) {
                start = mid + 1;
            } 
            else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public int search(int[] nums, int target) {

        int n = nums.length;

        int pivotIndex = pivot(nums);

        // Case 1: Array is not rotated
        if (pivotIndex == -1) {
            return binary(nums, 0, n - 1, target);
        }

        // Case 2: Search in first half
        if (pivotIndex > 0) {

            int startArray1 = 0;
            int endArray1 = pivotIndex - 1;

            if (target >= nums[startArray1] &&
                target <= nums[endArray1]) {

                return binary(nums, startArray1, endArray1, target);
            }
        }

        // Case 3: Search in second half
        int startArray2 = pivotIndex;
        int endArray2 = n - 1;

        if (target >= nums[startArray2] &&
            target <= nums[endArray2]) {

            return binary(nums, startArray2, endArray2, target);
        }

        return -1;
    }
}