class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        for(int i =0;i <nums.length;i++){
            if(nums[i] > max){
                sec = max;
                max = nums[i];
            }
            else if(nums[i] > sec){
                sec = nums[i];
            }
        }
        return (max-1) * (sec-1);
    }
}