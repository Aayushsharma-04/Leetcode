class Solution {
    public int countNicePairs(int[] nums) {
        int n = nums.length;
        long mod = 1000000007;
        long cnt =0;
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i =0;i<n;i++){
            int ans = nums[i] - rev(nums[i]);
            if(map.containsKey(ans)){
                cnt = (cnt +map.get(ans)) % mod;
            }
            map.put(ans,map.getOrDefault(ans,0) +1);

        }
        return (int)cnt ;
        
    }
    private int rev(int n){
        int rev =0;
        while(n>0){
            int temp = n%10;
            rev = rev *10 + temp;
            n/=10;
        }
        return rev;
    }
}