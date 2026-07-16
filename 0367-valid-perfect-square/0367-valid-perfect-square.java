class Solution {
    public boolean isPerfectSquare(int num) {
        int root = mySqrt(num);
        return (long) root * root == num;
    }
    private int mySqrt(int x) {
       
        if (x == 0 || x == 1) return x;
         long l = 1, r = x;
        long ans =0;
        while (l <= r) {
            long mid = l + (r-l) / 2;
            if (mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }

        }
        return (int)ans;
    }
}