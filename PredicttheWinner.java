class Solution {
    public boolean PredictTheWinner(int[] nums) {
        if(nums == null) return true;
        int n = nums.length; 
        if((n & 1)==0) return true;
        int arr[] = new int [n];
        for(int i=n-1; i>=0; i--)
        {
            for(int j=i; j<n; j++ )
            {
                if(i == j)
                {
                    arr[i] = nums[i];
                }
                else
                {
                    arr[j] = Math.max(nums[i] - arr[j], nums[j] -arr[j-1]);
                                       
                }
            }
        }
        return arr[n-1]>=0;
    }
}
