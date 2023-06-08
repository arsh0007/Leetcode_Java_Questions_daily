class Solution {

    public int countNegatives(int[][] grid) 
    {
        int count =0;
        for(int[] row : grid) 
        {
            count+=  countRowWise(row);
        }
        return count;
    }


    int countRowWise(int [] mat) 
    {
        int low = 0;
        int high = mat.length-1;

        while(low<=high) 
        {
            int mid = low +(high-low)/2;

            if(mat[mid] >= 0)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        } 
        return mat.length - high - 1;
    }


}
