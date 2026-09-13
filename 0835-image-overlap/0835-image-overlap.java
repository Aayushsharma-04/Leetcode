class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n = img1.length;
        int maxcountoverlap =0;
        for(int rowshift = -n +1; rowshift <=n;rowshift++){
            for(int colshift = -n +1;colshift <= n;colshift++){
                maxcountoverlap = Math.max(maxcountoverlap,countoverlap(img1, img2, rowshift, colshift, n));
            }
        }
        return maxcountoverlap;
    }

    private int countoverlap(int[][] img1, int[][] img2, int rowshift, int colshift, int n) {
        int count = 0;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                int img2row = r + rowshift;
                int img2col = c + colshift;
                if (img2row >= 0 && img2row < n && img2col >= 0 && img2col < n) {
                    if (img1[r][c] == 1 && img2[img2row][img2col] == 1) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}