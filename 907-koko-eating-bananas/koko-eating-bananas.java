class Solution {

    static boolean isValid(int[] piles, int h, int mid) {

        int totalHours = 0;

        for (int i = 0; i < piles.length; i++) {

            int hours = (piles[i] + mid - 1) / mid;

            totalHours += hours;

            if (totalHours > h) {
                return false;
            }
        }

        return true;
    }

    public int minEatingSpeed(int[] piles, int h) {

        int start =1;
        int end = piles[0];
        int ans = -1;

        for (int i = 1; i < piles.length; i++) {
            if (piles[i] > end) {
                end = piles[i];
            }
        }

        while(start<=end){
            int mid = start + (end-start)/2;

            if(isValid(piles, h, mid)) {
                ans = mid;
                end = mid - 1;
            }

            else{
                start = mid+1;
            }


        }

        return ans;

    }
}