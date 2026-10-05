class Solution {
    public int maximumWealth(int[][] accounts) {
        int maximum = 0;

        for (int i = 0; i < accounts.length; i++) {
            int wealth = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                wealth = wealth + accounts[i][j];
            }

            maximum = Math.max(wealth, maximum);
        }

        return maximum;
    }
}