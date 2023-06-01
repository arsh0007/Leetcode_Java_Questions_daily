class Solution 
{
    public int mySqrt(int x) 
    {
        long low = 1;
        long high = x;
        long result = 0;
        while(low <= high)
        {
            long mid = low + (high - low) / 2;

            if(mid * mid == x)
            {
                result = (int)mid;
                break;
            } 
            else if(mid * mid < x) 
            {
                low = mid + 1;
                result = mid;
            } 
            else
            {
                high = mid - 1;
            }
        }
        return (int)result;
    }
}
