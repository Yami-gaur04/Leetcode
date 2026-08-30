    class Solution {
    public int maximumWealth(int[][] accounts) {

        int Wealth = 0;

        for (int i = 0; i < accounts.length; i++) {

            int sum = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];
            }

            if (sum > Wealth) {
                Wealth = sum;
            }
        }

        return Wealth;
    }
}    
    
