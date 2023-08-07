class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int res = 0;
        for(int flag : hours)
        {
            if(flag >= target)
            res++;
        }
        return res;
    }
}
