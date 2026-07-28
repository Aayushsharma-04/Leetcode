class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atmostK(nums,k) - atmostK(nums,k-1);
    }
    private int atmostK(int[] nums,int k){
        int left = 0;
        int distinct =0;
        int count =0;
        int [] freq = new int[nums.length +1];
        for(int right =0;right <nums.length;right++){
            if(freq[nums[right]] == 0) distinct++;
        
        freq[nums[right]]++;
        
        while(distinct > k){
            freq[nums[left]]--;
            if(freq[nums[left]] == 0){
                distinct--;
            }
            left++;
        }
        count+= (right - left) +1;
       
        }
         return count;

    }

}