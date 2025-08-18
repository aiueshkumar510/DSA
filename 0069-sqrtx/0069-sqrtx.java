class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;  // handle edge cases

        int left = 1, right = x / 2, ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;  // to avoid overflow
            long sq = (long) mid * mid;          // prevent overflow

            if (sq == x) {
                return mid;   // perfect square
            } else if (sq < x) {
                ans = mid;   // store last valid candidate
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }
}
