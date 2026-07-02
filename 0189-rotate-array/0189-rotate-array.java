
    class Solution {
    public void rotate(int[] nums, int k) { 
        k = k% nums.length;
        rotatearray(nums,0,nums.length-1);

        rotatearray(nums,0,k -1);
        rotatearray(nums,k,nums.length-1);
        
        }
        public  void rotatearray(int[] nums,int start,int end){
        if (nums.length == 0) return;  
         

         while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
         }
        }
    }

  