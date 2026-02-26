class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int st = 1;
        int end = 0;
        for (int i = 0; i < piles.length; i++) {
            end = Math.max(end, piles[i]);
        }
        int res = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (valid(piles, mid, h)) {
                res = mid;
                end = mid - 1;   
            } else {
                st = mid + 1;    
            }
        }
        return res;
    }
    public boolean valid(int[] piles, int mid, int h) {
        int totalHours = 0;
        for (int i = 0; i < piles.length; i++) {
            totalHours += (piles[i] + mid - 1) / mid;
            if (totalHours > h) {
                return false;
            }
        }
        return true;
    }
}