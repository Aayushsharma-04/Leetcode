class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0) +1);
        }
        if(k ==1){
            int val = -1;
            for(int num : map.keySet()){
                if(map.get(num) ==1 ){
                    val = Math.max(val,num);
                }
            }
            return val;
        }
        if(k ==n){
            int val = -1;
            for(int num : nums){
                val = Math.max(val,num);
            }
            return val;
        }
        int ans = -1;
        if(map.get(nums[0]) == 1){
            ans = Math.max(nums[0],ans);
        }
        if(map.get(nums[n -1]) == 1){
            ans = Math.max(nums[n -1],ans);
        }
        return ans;
    }
}