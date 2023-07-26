class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int start=1;
        int end = (int) 1e8;

        while(start < end)
        {
            int middle = (start + end) / 2;
            if(OnTime(dist, hour, middle)) end= middle;
            else start = middle+1;
        }
        return end ==(int) 1e8 ? -1: end ;
    }
    private boolean OnTime(int[] distance, double hours, int speed)
    {
        int time = 0;
        for(int i = 0; i<distance.length-1; i++ )
        {
            time+=Math.ceil( (double) distance[i] / speed);
        }
        return time +(double)distance[distance.length-1]/speed <= hours;
    }
} 
