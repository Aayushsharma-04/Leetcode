class Solution {
    public boolean canJump(int[] nums) {
       int finalindex = nums.length -1;
       for(int idx = nums.length -1;idx >=0;idx--){
        if(idx + nums[idx] >= finalindex){
            finalindex = idx;
        }
       }
       return finalindex ==0; 
    }
}