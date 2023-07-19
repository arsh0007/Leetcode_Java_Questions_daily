class Solution 
{
    public int eraseOverlapIntervals(int[][] intervals) 
    {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int current=1;
        for(int i=1;i<intervals.length;i++)
            {
            if(intervals[i][0]>=intervals[0][1])
                {
                intervals[0][1]=intervals[i][1];
                current++;
            }
        }
        return intervals.length-current;
            
    }
}
