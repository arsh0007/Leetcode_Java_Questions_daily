class Solution 
{
    public int maximumCount(int[] nums) 
    {
        int low = 0; 
        int high = nums.length-1; 

        if(nums[0]>0 || nums[nums.length-1]<0) return nums.length;

        while (low < high)
        {
            int mid = low +(high - low ) / 2;
            if(nums[mid]<0) low = mid + 1;
            else high = mid;
        }

        int neg = low;
        while(low < nums.length && nums[low]==0) low++;
        int pos = nums.length - low;

        return Math.max(neg, pos);
    }
}
