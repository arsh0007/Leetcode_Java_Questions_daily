class Solution {
    public int findNonMinOrMax(int[] nums) {
            
            Arrays.sort(nums);
            int len = nums.length-1;
            if(len>1)
            {
                return nums[1];
                    
            } else
            {
                return -1;       
            }
           
    }
}
