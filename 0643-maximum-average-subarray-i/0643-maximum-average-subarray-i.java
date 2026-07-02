class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int ws =0;
        int ms =0;
        for(int i =0;i<k;i++){
            ws+= nums[i];
        }
         ms = ws;
        for(int j =k;j<nums.length;j++){
            ws = ws +nums[j] - nums[j-k];
            ms = Math.max(ms,ws);
        }
        return (double)ms/k;
    }
}