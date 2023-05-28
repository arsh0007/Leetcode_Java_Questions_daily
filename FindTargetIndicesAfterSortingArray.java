class Solution 
{
    public List<Integer> targetIndices(int[] nums, int target) 
    {
        List<Integer> list = new ArrayList<Integer>();
        int small = 0;
        int large = 0;
       
        for(int i: nums) 
        {
            if(i<target) 
            {
                small++;
            } else if(i>target) 
            {
                large++;
            }
        }
        
        for(int i=small; i<=nums.length-large-1; i++) 
        {
            list.add(i);
        }
        return list;
        
    }
}
