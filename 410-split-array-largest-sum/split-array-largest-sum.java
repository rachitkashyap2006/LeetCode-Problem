class Solution {

    static boolean isValid(int[] nums, int k, int maxLength) {

        int splitCount = 1;
        int arraySum = 0;

        for(int i = 0; i < nums.length; i++) {

            if(arraySum + nums[i] <= maxLength) {
                arraySum = arraySum + nums[i];
            }

            else {
                splitCount++;

                if(splitCount > k || nums[i] > maxLength) {
                    return false;
                }

                else {
                    arraySum = nums[i];
                }
            }
        }

        return true;
    }

    public int splitArray(int[] nums, int k) {

        int ans = -1;
        int s = 0;
        int sum = 0;

        for(int i = 0; i < nums.length; i++) {
            s = Math.max(s, nums[i]);
            sum = sum + nums[i];
        }

        int e = sum;

        while(s <= e) {

            int mid = s + (e - s) / 2;

            if(isValid(nums, k, mid)) {
                ans = mid;
                e = mid - 1;
            }

            else {
                s = mid + 1;
            }
        }

        return ans;
    }
}