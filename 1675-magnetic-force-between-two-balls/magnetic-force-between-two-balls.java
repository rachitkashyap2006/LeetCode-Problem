class Solution {
    static boolean isValid(int[]position, int m, int minF){
        int ball = 1;
        int lastPosition = 0;

        for(int i = 1; i < position.length; i++){
            if(position[i]- position[lastPosition] >= minF){
                ball++;

                lastPosition = i;
                if(ball == m){
                    return true;
                }
            }
        }
        return false;
    }
    public int maxDistance(int[] position, int m) {

        Arrays.sort(position);
        int n = position.length-1;

        int minforce = 0;
        int maxforce = position[n]-position[0];
        int ans = -1;

        while(minforce<=maxforce){
            int mid = minforce + (maxforce-minforce)/2;

            if(isValid(position, m, mid)){                
                ans = mid;
                minforce = mid+1;
            }
            else {
                maxforce = mid-1;
            }
        }

        return ans; 
        
    }
}