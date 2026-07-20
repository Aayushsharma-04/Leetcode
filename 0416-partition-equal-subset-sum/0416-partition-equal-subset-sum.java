class Solution {
    public boolean canPartition(int[] nums) {
        int totalsum =0;
        for(int num : nums){
            totalsum += num;
        }
        if(totalsum % 2 !=0){
            return false;
        }
        int target = totalsum/2;
        Boolean[][] memo = new Boolean[nums.length][target + 1];
       return backtrack(nums,0,target,memo);

    }

    private boolean backtrack(int[] nums,int index,int target,Boolean[][] memo){
        if (target == 0){
            return true;
        }
        if(index == nums.length || target <0){
            return false;
        }
         if (memo[index][target] != null) {
            return memo[index][target];
        }

       if( backtrack(nums,index +1 , target - nums[index],memo)){
        return memo[index][target] = true;

       }

        if(backtrack(nums,index +1,target,memo)){
           return memo[index][target] = true;

        }
          return memo[index][target] = false;
    }
}