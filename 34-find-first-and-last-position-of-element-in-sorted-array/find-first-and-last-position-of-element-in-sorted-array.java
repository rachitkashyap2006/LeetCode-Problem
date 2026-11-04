class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int lb = -1;
        int ub = -1;

        while(start<=end){
            int mid = (start+end)/2;
            if(target <= nums[mid]){
                lb = mid;
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }

        if (lb == -1 || nums[lb] != target) {
            return new int[]{-1, -1};
        }

        start = 0;
        end = nums.length-1;

        while(start<=end){
            int mid = (start+end)/2;
            if(target>=nums[mid]){
                ub = mid;
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return new int[]{lb, ub};
    }
}