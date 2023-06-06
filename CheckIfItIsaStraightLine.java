class Solution 
{
    public boolean checkStraightLine(int[][] nums) 
    {
        int y = nums[1][1]-nums[0][1];
        int x = nums[1][0]-nums[0][0];

       for(int i=2; i<nums.length; i++) 
       {
           if(y * (nums[i][0]- nums[0][0]) != (nums[i][1] - nums[0][1]) * x) 
           {
               return false;
           }
       }
       return true;
    }
}
