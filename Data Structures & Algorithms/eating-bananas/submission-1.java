class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int longestPile = 0;
        
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > longestPile) {
                longestPile = piles[i];
            }
        }
        
        int left = 1;
        int right = longestPile;

        while (left <= right) {
            int mid = (left + right) / 2;
        
            if (helper(piles, h, mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private boolean helper(int[] piles, int h, int speed) {
        int hoursSpent = 0;
        
        for (int pile : piles) {
            hoursSpent += (pile + speed - 1) / speed;
            
            if (hoursSpent > h) {
                return false;
            }
        }
        
        return hoursSpent <= h;
    }
}
