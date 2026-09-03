class Solution {
    public boolean uniformArray(int[] nums1) {
        int mineven = Integer.MAX_VALUE;
        int minodd = Integer.MAX_VALUE;
        for (int num : nums1) {
            if (num % 2 == 0) {
                mineven = Math.min(num, mineven);
            } else {
                minodd = Math.min(num, minodd);
            }

        }
        if (mineven == Integer.MAX_VALUE || minodd == Integer.MAX_VALUE) {
            return true;
        }
        return minodd < mineven;
    }
}