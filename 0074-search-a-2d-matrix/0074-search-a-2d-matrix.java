class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int[] row : matrix) {
            if (target >= row[0] && target <= row[row.length - 1]) {
                int start = 0, left = row.length -1;
                while (start <= left) {
                    int mid = start + (left - start) / 2;
                    if (row[mid] == target)
                        return true;
                    else if (row[mid] < target)
                        start = mid + 1;
                    else
                        left = mid - 1;
                }

            }
        }
        return false;
    }
}