class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0; 
        int j=0;
        while(i<nums.length)
        {           
            if((nums[i] & 1) == 0)
            {
                int a = nums[i];
                nums[i] = nums[j];
                nums[j]=a;
                j++;
            }
            i++;
        }
        return nums;   
    }
}
