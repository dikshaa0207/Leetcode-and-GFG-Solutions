class Solution {

    public int shipWithinDays(int[] weights, int days) {

        int st = 0, end = 0;

        for (int w : weights) {
            st = Math.max(st, w);
            end += w;
        }

        while (st < end) {

            int mid = st + (end - st) / 2;

            if (valid(weights, mid, days))
                end = mid;
            else
                st = mid + 1;
        }

        return st;
    }

    private boolean valid(int[] weights, int cap, int days) {

        int d = 1, sum = 0;

        for (int w : weights) {
            if (sum + w > cap) {
                d++;
                sum = 0;
            }
            sum += w;
        }

        return d <= days;
    }
}